import java.util.Scanner;


public class Chatbot {

    public static void main(String[] args) {
        
        System.out.println("Hello! Who am I helping today?");
        Scanner scan = new Scanner(System.in);
        
        String name = scan.nextLine();
       
        System.out.println("What food are you craving, " + name + "? (Mexican, American)");
        
        String typeFood = scan.nextLine();
        
        if (typeFood.equalsIgnoreCase("mexican"))
        {
            
            System.out.println("How long do you want to wait (short, long)");
            String waitTime = scan.nextLine();
            
            if(waitTime.equalsIgnoreCase ("short"))
            {
                System.out.println("You will be waiting for " + typeFood + " food for < 10 minutes.");
                System.out.println("How much are you willing to spend? (enter an amount)");
                String stringMoney = scan.nextLine();
                int money = Integer.parseInt(stringMoney);
                
                if (money < 20)
                {
                    System.out.println("Is fast food okay?");
                    String fastFood = scan.nextLine();
                 
                    if (fastFood.equalsIgnoreCase("yes") || fastFood.equalsIgnoreCase("yeah") || fastFood.equalsIgnoreCase("sure"))
                    {
                        System.out.println("How about Chipotle?");
                        String chipotle = scan.nextLine();
                        
                        if(chipotle.equalsIgnoreCase("yes") || chipotle.equalsIgnoreCase("yeah") || chipotle.equalsIgnoreCase("sure"))
                        {
                            System.out.println("Good choice, " + name + ".");
                            System.out.println("Thank you for your order with Chipotle! You will be waiting for less than 10 minutes and you are paying less than $20.");
                        }
                        else 
                        {
                            System.out.println("How about Taco Bell?");
                            String tacoBell = scan.nextLine();
                            
                            if (tacoBell.equalsIgnoreCase("yes") || tacoBell.equalsIgnoreCase("yeah") || tacoBell.equalsIgnoreCase("sure"))
                            {
                                System.out.println("Good choice, " + name + ".");
                                System.out.println("Thank you for your order with Taco Bell! You will be waiting for less than 10 minutes and you are paying less than $20");
                            }
                            else 
                            {
                                System.out.println("How about Qdoba?");
                                String qdoba = scan.nextLine();
                                    
                                    if (qdoba.equalsIgnoreCase("yes") || qdoba.equalsIgnoreCase("yeah") || qdoba.equalsIgnoreCase("sure"))
                                    {
                                    System.out.println("Good choice, " + name + ".");
                                    System.out.println("Thank you for your order with Qdoba! You will be waiting for less than 10 minutes and you are paying less than $20.");
                                    }
                                    else 
                                    {
                                    System.out.println("Please choose an option above.");
                                    }
                            }
                        }
                    }
                    else 
                    {
                        System.out.println("You will have to pay more. Is that okay?");
                        String payMore = scan.nextLine();
                        
                        if (payMore.equalsIgnoreCase("yes") || payMore.equalsIgnoreCase("yeah") || payMore.equalsIgnoreCase("sure"))
                        {
                            System.out.println("How about Mad Mex?");
                            String madMex = scan.nextLine();
                            
                            if (madMex.equalsIgnoreCase("yes") || madMex.equalsIgnoreCase("yeah") || madMex.equalsIgnoreCase("sure"))
                            {
                                System.out.println("Good choice, " + name + ".");
                                System.out.println("Thank you for your order with Mad Mex! You will be waiting for more than 10 minutes and you are paying more than $20.");
                            }
                            else 
                            {
                                System.out.println("Please choose an option above.");
                            }
                        }
                    }
                    
                }
                else 
                    {
                        System.out.println("You may have to wait longer for Mexican over $20. Is that okay?");
                        String waitLong = scan.nextLine();

                        if (waitLong.equalsIgnoreCase("yes") || waitLong.equalsIgnoreCase("yeah") || waitLong.equalsIgnoreCase("sure"))
                        {
                            System.out.println("How about Mad Mex?");
                            String madMex = scan.nextLine();
                            
                            if (madMex.equalsIgnoreCase("yes") || madMex.equalsIgnoreCase("yeah") || madMex.equalsIgnoreCase("sure"))
                            {
                                System.out.println("Good choice, " + name + ".");
                                System.out.println("Thank you for your order with Mad Mex! You will be waiting for more than 10 minutes and you are paying more than $20.");
                            }
                            else
                            {
                            System.out.println("Please choose an option above");
                            }
                        }
                        else
                        {
                            System.out.println("You will have to go cheaper");
                        }
                    }
                
            }
            else 
            {
                System.out.println("You will be waiting for Mexican food > than 10 minutes");
                System.out.println("How much are you willing to spend? (enter an amount)");
                String stringMoney = scan.nextLine();
                int money = Integer.parseInt(stringMoney);
                
                if(money < 20)
                {
                    System.out.println("You will not have to wait long for Mexican under $20. Is that okay?");
                    String fastFood = scan.nextLine();
                    
                    if(fastFood.equalsIgnoreCase("yes") || fastFood.equalsIgnoreCase("yeah") || fastFood.equalsIgnoreCase("sure"))
                    {
                        System.out.println("How about Chipotle?");
                        String chipotle = scan.nextLine();
                        
                        if(chipotle.equalsIgnoreCase("yes") || chipotle.equalsIgnoreCase("yeah") || chipotle.equalsIgnoreCase("sure"))
                        {
                            System.out.println("Good choice, " + name + ".");
                            System.out.println("Thank you for your order with Chipotle! You will be waiting for less than 10 minutes and you are paying less than $20.");
                        }
                        else 
                        {
                            System.out.println("How about Taco Bell?");
                            String tacoBell = scan.nextLine();
                            
                            if (tacoBell.equalsIgnoreCase("yes") || tacoBell.equalsIgnoreCase("yeah") || tacoBell.equalsIgnoreCase("sure"))
                            {
                                System.out.println("Good choice, " + name + ".");
                                System.out.println("Thank you for your order with Taco Bell! You will be waiting for less than 10 minutes and you are paying less than $20");
                            }
                            else 
                            {
                                System.out.println("How about Qdoba?");
                                String qdoba = scan.nextLine();
                                    
                                    if (qdoba.equalsIgnoreCase("yes") || qdoba.equalsIgnoreCase("yeah") || qdoba.equalsIgnoreCase("sure"))
                                    {
                                    System.out.println("Good choice, " + name + ".");
                                    System.out.println("Thank you for your order with Qdoba! You will be waiting for less than 10 minutes and you are paying less than $20.");
                                    }
                                    else 
                                    {
                                    System.out.println("Please choose an option above.");
                                    }
                            }
                        }
                    }
                    else 
                    {
                        System.out.println("You will have to spend more.");
                    }
                }
                else 
                {
                    System.out.println("How about Mad Mex?");
                    String madMex = scan.nextLine();

                    if (madMex.equalsIgnoreCase("yes") || madMex.equalsIgnoreCase("yeah") || madMex.equalsIgnoreCase("sure"))
                    {
                        System.out.println("Good choice, " + name + ".");
                        System.out.println("Thank you for your order with Mad Mex! You will be waiting for more than 10 minutes and you are paying more than $20.");
                    }
                    else 
                    {
                        System.out.println("You will have to go cheaper.");
                    }
                }
            }
        }
        else 
        {
            System.out.println("How long do you want to wait (short, long)");
            String waitTime = scan.nextLine();
            
            if(waitTime.equalsIgnoreCase ("short"))
            {
                System.out.println("You will be waiting for " + typeFood + " food for < 10 minutes.");
                System.out.println("How much are you willing to spend? (enter an amount)");
                String stringMoney = scan.nextLine();
                int money = Integer.parseInt(stringMoney);
                
                if (money < 20)
                {
                    System.out.println("Is fast food okay?");
                    String fastFood = scan.nextLine();
                 
                    if (fastFood.equalsIgnoreCase("yes") || fastFood.equalsIgnoreCase("yeah") || fastFood.equalsIgnoreCase("sure"))
                    {
                        System.out.println("How about McDonalds?");
                        String mcdonalds = scan.nextLine();
                        
                        if(mcdonalds.equalsIgnoreCase("yes") || mcdonalds.equalsIgnoreCase("yeah") || mcdonalds.equalsIgnoreCase("sure"))
                        {
                            System.out.println("Good choice, " + name + ".");
                            System.out.println("Thank you for your order with McDonalds! You will be waiting for less than 10 minutes and you are paying less than $20.");
                        }
                        else 
                        {
                            System.out.println("How about Burger King?");
                            String burgerKing = scan.nextLine();
                            
                            if (burgerKing.equalsIgnoreCase("yes") || burgerKing.equalsIgnoreCase("yeah") || burgerKing.equalsIgnoreCase("sure"))
                            {
                                System.out.println("Good choice, " + name + ".");
                                System.out.println("Thank you for your order with Burger King! You will be waiting for less than 10 minutes and you are paying less than $20");
                            }
                            else 
                            {
                                System.out.println("How about Wendy's?");
                                String wendys = scan.nextLine();
                                    
                                    if (wendys.equalsIgnoreCase("yes") || wendys.equalsIgnoreCase("yeah") || wendys.equalsIgnoreCase("sure"))
                                    {
                                    System.out.println("Good choice, " + name + ".");
                                    System.out.println("Thank you for your order with Wendy's! You will be waiting for less than 10 minutes and you are paying less than $20.");
                                    }
                                    else 
                                    {
                                    System.out.println("Please choose an option above.");
                                    }
                            }
                        }
                    }
                
            
        
    


                    else 
                    {
                        System.out.println("You will have to pay more. Is that okay?");
                        String payMore = scan.nextLine();
                        
                        if (payMore.equalsIgnoreCase("yes") || payMore.equalsIgnoreCase("yeah") || payMore.equalsIgnoreCase("sure"))
                        {
                            System.out.println("How about The Tavern?");
                            String theTavern = scan.nextLine();
                            
                            if (theTavern.equalsIgnoreCase("yes") || theTavern.equalsIgnoreCase("yeah") || theTavern.equalsIgnoreCase("sure"))
                            {
                                System.out.println("Good choice, " + name + ".");
                                System.out.println("Thank you for your order with The Tavern! You will be waiting for more than 10 minutes and you are paying more than $20.");
                            }
                            else 
                            {
                                System.out.println("How about The Corner Room?");
                                String theCornerRoom = scan.nextLine();
                                
                                if (theCornerRoom.equalsIgnoreCase("yes") || theCornerRoom.equalsIgnoreCase("yeah") || theCornerRoom.equalsIgnoreCase("sure"))
                                {
                                    System.out.println("Good choice, " + name + ".");
                                    System.out.println("Thank you for your order with The Corner Room! You will be waiting for more than 10 minutes and you are paying more than $20");
                                }
                            }
                        }
                    }               
                }
                else 
                {
                    System.out.println("You may have to wait longer for American over $20. Is that okay?");
                    String waitLong = scan.nextLine();

                    if (waitLong.equalsIgnoreCase("yes") || waitLong.equalsIgnoreCase("yeah") || waitLong.equalsIgnoreCase("sure"))
                    {
                    System.out.println("How about The Tavern?");
                    String theTavern = scan.nextLine();
                        if (theTavern.equalsIgnoreCase("yes") || theTavern.equalsIgnoreCase("yeah") || theTavern.equalsIgnoreCase("sure"))
                        {
                            System.out.println("Good choice, " + name + ".");
                            System.out.println("Thank you for your order with The Tavern! You will be waiting for more than 10 minutes and you are paying more than $20.");
                        }
                        else
                        {
                            System.out.println("How about The Corner Room?");
                            String theCornerRoom = scan.nextLine();

                            if (theCornerRoom.equalsIgnoreCase("yes") || theCornerRoom.equalsIgnoreCase("yeah") || theCornerRoom.equalsIgnoreCase("sure"))
                            {
                            System.out.println("Good choice, " + name + ".");
                            System.out.println("Thank you for your order with The Corner Room! You will be waiting for more than 10 minutes and you are paying more than $20");
                            }
                        }   
                    }
                    else
                    {
                        System.out.println("You will have to go cheaper.");
                    }
                }           
            }
            else 
            {
                System.out.println("You will be waiting for American food > than 10 minutes");
                System.out.println("How much are you willing to spend? (enter an amount)");
                String stringMoney = scan.nextLine();
                int money = Integer.parseInt(stringMoney);
                
                if(money < 20)
                {
                    System.out.println("You will not have to wait long for American under $20. Is that okay?");
                    String fastFood = scan.nextLine();
                   
                    if(fastFood.equalsIgnoreCase("yes") || fastFood.equalsIgnoreCase("yeah") || fastFood.equalsIgnoreCase("sure"))
                    {
                        System.out.println("How about McDonalds?");
                        String mcdonalds = scan.nextLine();
                        
                        if(mcdonalds.equalsIgnoreCase("yes") || mcdonalds.equalsIgnoreCase("yeah") || mcdonalds.equalsIgnoreCase("sure"))
                        {
                            System.out.println("Good choice, " + name + ".");
                            System.out.println("Thank you for your order with McDonalds! You will be waiting for less than 10 minutes and you are paying less than $20.");
                        }
                        else 
                        {
                            System.out.println("How about Burger King?");
                            String burgerKing = scan.nextLine();
                            
                            if (burgerKing.equalsIgnoreCase("yes") || burgerKing.equalsIgnoreCase("yeah") || burgerKing.equalsIgnoreCase("sure"))
                            {
                                System.out.println("Good choice, " + name + ".");
                                System.out.println("Thank you for your order with Burger King! You will be waiting for less than 10 minutes and you are paying less than $20");
                            }
                            else 
                            {
                                System.out.println("How about Wendy's?");
                                String wendys = scan.nextLine();
                                    
                                    if (wendys.equalsIgnoreCase("yes") || wendys.equalsIgnoreCase("yeah") || wendys.equalsIgnoreCase("sure"))
                                    {
                                    System.out.println("Good choice, " + name + ".");
                                    System.out.println("Thank you for your order with Wendy's! You will be waiting for less than 10 minutes and you are paying less than $20.");
                                    }
                                    else 
                                    {
                                    System.out.println("Please choose an option above.");
                                    }
                            }
                        }
                    }
                    else 
                    {
                        System.out.println("You will have to spend more.");
                    }
                }
                else 
                {
                    System.out.println("How about The Tavern?");
                    String theTavern = scan.nextLine();
                        if (theTavern.equalsIgnoreCase("yes") || theTavern.equalsIgnoreCase("yeah") || theTavern.equalsIgnoreCase("sure"))
                        {
                            System.out.println("Good choice, " + name + ".");
                            System.out.println("Thank you for your order with The Tavern! You will be waiting for more than 10 minutes and you are paying more than $20.");
                        }
                        else
                        {
                            System.out.println("How about The Corner Room?");
                            String theCornerRoom = scan.nextLine();

                            if (theCornerRoom.equalsIgnoreCase("yes") || theCornerRoom.equalsIgnoreCase("yeah") || theCornerRoom.equalsIgnoreCase("sure"))
                            {
                                System.out.println("Good choice, " + name + ".");
                                System.out.println("Thank you for your order with The Corner Room! You will be waiting for more than 10 minutes and you are paying more than $20");
                            }
                            else 
                            {
                                System.out.println("You will have to go cheaper.");
                            }
                        }
                }
            }
        }    
    }
}