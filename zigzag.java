   class Main{
    public static void main(String[]args){
        for(int row = 1;row<=5;row++){
            for(int col = 1;col<=5-row;col++){//1<=4
                System.out.print(" ");
            }
             for(int col = 1;col<=5;col++){
        System.out.print("*");
        }
        System.out.println();
        }
    }    
}



