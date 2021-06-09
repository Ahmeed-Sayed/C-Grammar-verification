import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class replace extends gramBaseVisitor{


    @Override public Integer visitEnumSpecifier(gramParser.EnumSpecifierContext ctx) {   // checks enum syntax , doesn't work with global you have to disable it .
        JSONParser parser = new JSONParser();
        String regex = null;
        try {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj;
            regex = (String) jsonObject.get("IDEnum");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String ID = ctx.Identifier().getText();
        int line = ctx.getStart().getLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ID);
        boolean matchFound = matcher.find();
        if (!matchFound) {
            System.out.println(ID+" Enum Syntax not Correct at line: " + line);

        }
        return 0;


       }


   /*@Override public Integer visitGlobaldeclaration(gramParser.GlobaldeclarationContext ctx) {

        JSONParser parser = new JSONParser();
        String regex = null;


            //struct/enum/union # #;
            String type1 = ctx.declaration().declarationSpecifiers().getChild(0).getText();
            String ID = ctx.declaration().declarationSpecifiers().getChild(1).getText();
            int line = ctx.getStart().getLine();
            String type2 = new String();

            if (type1.charAt(0) == 'e') {
                try {
                    Object obj = parser.parse(new FileReader("myJSON.json"));
                    JSONObject jsonObject = (JSONObject) obj;
                    regex = (String) jsonObject.get("IDEnumGB");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                type2 = "enum";
            } else if (type1.charAt(0) == 's' && type1.charAt(1) == 't') {
                try {
                    Object obj = parser.parse(new FileReader("myJSON.json"));
                    JSONObject jsonObject = (JSONObject) obj;
                    regex = (String) jsonObject.get("IDStructGB");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                type2 = "struct";


            } else if (type1.charAt(0) == 'u' && type1.charAt(1) == 'n') {
                try {
                    Object obj = parser.parse(new FileReader("myJSON.json"));
                    JSONObject jsonObject = (JSONObject) obj;
                    regex = (String) jsonObject.get("IDUnionGB");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                type2 = "union";
            } else {
                    try {
                        Object obj = parser.parse(new FileReader("myJSON.json"));
                        JSONObject jsonObject = (JSONObject) obj;
                        regex = (String) jsonObject.get("IDNormalGB");

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    type2 = ctx.declaration().declarationSpecifiers().getChild(0).getText();
            }


            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(ID);
            boolean matchFound = matcher.find();
            if (!matchFound) {
                System.out.println(ID + " global syntax not Correct at line: " + line);
            }



return 0;
    }

*/




   @Override public Integer visitLocaldeclaration(gramParser.LocaldeclarationContext ctx) {            // checks Local enum,union,struct, type variables syntax
                                                                                                       // not working with function definition


      JSONParser parser = new JSONParser();
       String regex = null;



           //struct/enum/union # #;
           String type1 = ctx.declaration().declarationSpecifiers().getChild(0).getText();
           String ID = ctx.declaration().declarationSpecifiers().getChild(1).getText();
           int line = ctx.getStart().getLine();
           String type2 = new String();

           if (type1.charAt(0) == 'e') {
               try {
                   Object obj = parser.parse(new FileReader("myJSON.json"));
                   JSONObject jsonObject = (JSONObject) obj;
                   regex = (String) jsonObject.get("IDEnumLC");

               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               } catch (IOException e) {
                   e.printStackTrace();
               } catch (ParseException e) {
                   e.printStackTrace();
               }
               type2 = "enum";
           } else if (type1.charAt(0) == 's' && type1.charAt(1) == 't') {
               try {
                   Object obj = parser.parse(new FileReader("myJSON.json"));
                   JSONObject jsonObject = (JSONObject) obj;
                   regex = (String) jsonObject.get("IDStructLC");

               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               } catch (IOException e) {
                   e.printStackTrace();
               } catch (ParseException e) {
                   e.printStackTrace();
               }
               type2 = "struct";


           } else if (type1.charAt(0) == 'u' && type1.charAt(1) == 'n') {
               try {
                   Object obj = parser.parse(new FileReader("myJSON.json"));
                   JSONObject jsonObject = (JSONObject) obj;
                   regex = (String) jsonObject.get("IDUnionLC");

               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               } catch (IOException e) {
                   e.printStackTrace();
               } catch (ParseException e) {
                   e.printStackTrace();
               }
               type2 = "union";
           }
           else {
               try {
                   Object obj = parser.parse(new FileReader("myJSON.json"));
                   JSONObject jsonObject = (JSONObject) obj;
                   regex = (String) jsonObject.get("IDNormalLC");

               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               } catch (IOException e) {
                   e.printStackTrace();
               } catch (ParseException e) {
                   e.printStackTrace();
               }
               type2 = ctx.declaration().declarationSpecifiers().getChild(0).getText();
           }


       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(ID);
       boolean matchFound = matcher.find();
       if (!matchFound) {
           System.out.println(ID +" "+ type2+ " local syntax not Correct at line: " + line);
       }




return 0;}

    @Override public Integer visitStructOrUniontype (gramParser.StructOrUniontypeContext ctx) {    // checks global struct or union declarator syntax
                                                                                                  //not working with global declaration on
        JSONParser parser = new JSONParser();
        String regex = null;
         String type=ctx.structOrUnionSpecifier().structOrUnion().getText();

        try {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj;
            regex = (String) jsonObject.get("IDStructUnion");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String ID = ctx.structOrUnionSpecifier().Identifier().getText();
        int line = ctx.getStart().getLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ID);
        boolean matchFound = matcher.find();
        if (!matchFound) {
            System.out.println(ID +" StructOrUnion Syntax not Correct at line: " + line);

        }
        return 0;

    }

  /*  @Override public Integer visitFunctiondeclaration(gramParser.FunctiondeclarationContext ctx) { //not working with global
        JSONParser parser = new JSONParser();
        String regex = null;

        try {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj;
            regex = (String) jsonObject.get("IDFun");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int line = ctx.getStart().getLine();
        String ID2 = ctx.functionDefinition().declarator().directDeclarator().getText();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ID2);
        boolean matchFound = matcher.find();
        if(!matchFound) {
            System.out.println(ID2+" Function name Syntax not Correct at line: " + line);
        }
        return 0;


    }

*/




}





