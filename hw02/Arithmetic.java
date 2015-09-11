/////////////////////////////////////////////////////////////////////////////////////////////////
//Winston La
//Lab 01
//To calculate the costs and goods of each item bought at Walmart, the total costs of goods, and the cost of goods
//after sales tax
// First Compile Arithmetic.java
//the run Arithmetic.java

//define class
public class Arithmetic{
    //provide main method
    public static void main(String[] args){
        //declare necessary variables
        //number of socks
        int nSock = 3;
        //cost per sock
        //'$' is part of the variable name
        double sockCost$ = 2.58;
        //# of drinking glass
        int nGlass = 6;
        //Cost per Glass
        double glassCost$ = 2.29;
        //number of boxes of envelopes bought
        int nEnvelope = 1;
        //cost per envelope
        double envelopeCost$ =3.25;
        //PA sales tax
        double paTax = 0.06;
        
        //total Costs for each good
        double totalSockCost$ = nSock * sockCost$;
        double totalGlassCost$ = nGlass * glassCost$;
        double totalEnvelopeCost$ = nEnvelope * envelopeCost$;
        
        //total Costs of all goods pretax
        double totalPreTaxCost$ = ((int)((totalEnvelopeCost$ + totalGlassCost$ + totalSockCost$)*100))/100.0;
        
        // Cost of goods with sales tax
        double taxSock$ = (int)((((int)((totalSockCost$ * paTax) * 100) /100.0) + totalSockCost$)*100)/100.0;
        double taxGlass$ = ((int)((totalGlassCost$ * paTax) * 100) /100.0) + totalGlassCost$;
        double taxEnvelope$ = ((int)((totalEnvelopeCost$ * paTax) * 100) /100.0) +totalEnvelopeCost$;
        
        
        // what you pay with tax
        double youPay$ = ((int)((totalPreTaxCost$ * paTax) * 100) /100.0) + totalPreTaxCost$;
        
        //print out receipt
        
        /*System.out.println("Cost of Goods");
        //print out individual cost of goods in order of
        // Item     Number Bought       CostPerGood     Cost
        //The print result should be in grid format
        System.out.println("Item        NumberBought        CostPerGood         CostPreTax         CostAfterTax");
        System.out.println("Sock            " + nSock +     "                " + sockCost$ +     "                 " + totalSockCost$ +    "                 " + taxSock$);
        System.out.println("Glass           " + nGlass +    "                " + glassCost$ +    "                 " + totalGlassCost$+    "                 " + taxGlass$);   
        System.out.println("Envelope        " + nEnvelope + "                " + envelopeCost$ + "                 " + totalEnvelopeCost$  "                 " + taxEnvelope$);
        System.out.println("The total Cost before tax is " + totalPreTaxCost$ " and the total cost after tax is" + youPay$);
       */
       
       
       
       
       
       
       
       
       
       
        System.out.println("Cost of Goods PreTax");
        //print out individual cost of goods in order of
        // Item     Number Bought       CostPerGood     Cost  
        System.out.println("Item        NumberBought        CostPerGood         CostPreTax");
        System.out.println("Sock            " + nSock + "                " + sockCost$ + "                 " + totalSockCost$);
        System.out.println("Glass           " + nGlass + "                " + glassCost$ + "                 " + totalGlassCost$);
        System.out.println("Envelope        " + nEnvelope + "                " + envelopeCost$ + "                  " + totalEnvelopeCost$);
        
        //Print out total pre tax
        System.out.println("Total Cost before tax: " + totalPreTaxCost$);
        
        //Print out costs after tax
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("Cost of Goods After Tax is Applied");
        System.out.println("    ");
        System.out.println("Item            NumberBought       CostPerGood        CostPostTax");
        
        //Print out values post tax
        System.out.println("Sock                " + nSock +     "                   " + sockCost$ +     "               " + taxSock$);
        System.out.println("Glass               " + nGlass +    "                   " + glassCost$ +    "               " + taxGlass$);
        System.out.println("Envelope            " + nEnvelope + "                   " + envelopeCost$ + "               " + taxEnvelope$);
        //Print total posttax cost
        System.out.println("Total Cost: " + youPay$);
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
    