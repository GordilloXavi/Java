package qeen;
import javax.swing.*;

public class EightQueens{
	
	//TODO = PONER UN SPINNER QUE PERMITA INTRODUCIR EL N�MERO DE REINAS DESEADAS.
	
	public static void main(String args[]){
		
		
			
			JOptionPane.showMessageDialog(null,  " Benvingut/a al meu programa per resoldre el problema de les 8 reines"
					+ "\n El programa encara est� en fase de desenvolupament i encara hi ha moltes codes a millorar i afegir"
					+ "\n Si vols crear un nou tauler amb n reines, haur�s de reiniciar el programa, ja que no he tingut temps de fer que el bot� de reset funcioni! "
					+ "\n Si trobes un bug o tens alguna idea per millorar el programa, envia els suggeriments a xavigr00@gmail.com");
		
			
			
			new MarcoQueen();

		
		
		
		//Meter un if para ver que el n�mero sea un n�mero y no se pase de 25.
		
        //int finished[] = solveQueens(num);
        
        //display(finished);
        
        //display(solveQueens(num))
        
        
        
        
        	
        	
        ////FIN MAIN	
        }

	   public static char[] display(int[] board){
		   
		   char[] tab = new char[board.length*board.length];
		   
	      int n = board.length;
	      
	      int cou = 0;
	      
	      for(int column = 0; column < n; column++){
	    	  
	         for(int row = 0; row < n; row++){
	        	 
	            if(board[column] == row) {
	            	
	               System.out.print('Q');
	            
	            tab[cou] = 'Q';
	            cou++;
	            	
	            
	            }  else {
	    	   
	         System.out.print('X');
	            
	            tab[cou] = 'X';
	            cou++;
	       }

	         }
	         
	         System.out.println();
	         
	         
	         
	      }
	      return tab;
	   }

	    public static int[] solveQueens(int n){//�sto solo crea el tablero y despu�s de hacer los c�lculos pertinentes, devuuelve el tablero resuelto.
	    	
	        int board[] = new int[n];
	        
	        placeQueen(board,0);
	        
	        return board;
	    }
	    
	    private static boolean placeQueen(int[] board, int column){//LA PARTE TOCHA, LA RECURSI�N
	    	
	        int n = board.length;
	        
	        if (n == column){
	        	
	            return true;
	            
	        }else{
	        	
	            for (int row = 0; row < n; row++){
	            	
	               int i;
	                
	                for (i = 0; i < column; i++){  
	                	
	                    if (board[i] == row || i - column == board[i] - row || column - i == board[i] - row){
	                    	
	                        break;
	                        
	                    }
	                }
	                if (i == column){ 
	                	
	                    board[column] = row;
	                    
	                    if (placeQueen(board, column + 1))//APPARENTLY, THE RECURSION HAPPENS HERE.
	                    	
	                        return true;
	                }
	            }
	        }
	        return false;
	    }
	    
	    
	    
	    // ####### FIN DE PLACEQUEEN, LA PARTE IMPORTANTE DEL CODE!!
	    
	    }