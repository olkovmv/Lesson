package Dz1;

public class Dz1_5 {
        public static void main(String[] args){
            int [][] dvMas = new int[5][8];
            for(int i =0;i<dvMas.length;i++){
                for(int h=0;h<dvMas[i].length;h++){
                    dvMas[i][h]=(int)((Math.random()*199)-99);
                    System.out.print(dvMas[i][h]+" ");
                }
            }
            int min=dvMas[0][0];
            for(int i =0;i<dvMas.length;i++){
                for(int h=0;h<dvMas[i].length;h++){
                    if(dvMas[i][h]>min)min=dvMas[i][h];
                }
            }
            System.out.println(" ");
            System.out.println("Максимальный эллемент = "+min);
        }
    }
