/*
 *Programador: Gilson Roberto Oshiro
 *Data: 12/03/2016
 *Objetivo: Caixa Eletronico
 

/**
 *
 * @author Gilson Roberto Oshiro
 */

import javax.swing.JOptionPane;

public class CaixaEletronicoLote4 {
    
      public static void main(String args[]){
        
        double mat[][] = new double [6][6];
        int opc = 0;
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada: \n 1: Carregar Notas \n 2: Retirar Notas \n 3: Estatística \n 9: Fim "));
            switch (opc){
                case 1:
                    mat = Carregar_Notas(mat);
                    break;
                case 2:
                    mat = Retirar_Notas(mat);
                    break;
                case 3:
                    Estatistica(mat);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "F I M");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }                
                
        }       
        
    }
    public static double[][] Carregar_Notas(double M[][]){
        
        int l,c;
        M[0][0] = 100;
        M[0][1] = 50;
        M[0][2] = 20;
        M[0][3] = 10;
        M[0][4] = 5;
        M[0][5] = 2;	   
        l = 1;
        while (l==1){ // Carrega as notas no caixa eletrônico, na linha 1 da matriz

            for (c=0;c<=5;c++){
		M[l][c] += Integer.parseInt(JOptionPane.showInputDialog("Carregue com notas de R$"+(M[0][c])));
            }
            l=l+1;
        }
    JOptionPane.showMessageDialog(null, "Caixa carregado com sucesso!");                  
    return M;
    }
    
    public static double[][] Retirar_Notas(double m[][]){
        
        double vl,tt_cx,sum,min1,min2,min3,min4;
        int bk,Resp,n100,n50,n20,n10,n5,n2;
        bk = 0;
        sum = 0;
        n2 = 0;
        n5 = 0;
        n10 = 0;
        n20 = 0;
        n50 = 0;
        n100 = 0;
        min1 = 1000.00;
        min2 = 1000.00;
        min3 = 1000.00;
        min4 = 1000.00;        
                               
        if (m[5][4]<99){           
            bk = Integer.parseInt(JOptionPane.showInputDialog("Escolhas as opções: \n 1 - Banco do Brasil \n 2 - Santander \n 3 - Itaú \n 4 - Caixa Economica Federal \n 9 - F I M "));
            switch (bk){
                case 1:
                    JOptionPane.showMessageDialog (null, " Bem Vindo ao Banco do Brasil!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog (null, "Bem Vindo ao Santander!");
                    break;
                case 3:
                    JOptionPane.showMessageDialog (null, "Bem Vindo ao Itaú!");
                    break;
                case 4:
                    JOptionPane.showMessageDialog (null, "Bem Vindo à Caixa Economica Federal!");
                    break;
                case 9: 
                    JOptionPane.showMessageDialog (null, "F I M");
                    break;
                default:
                    JOptionPane.showMessageDialog (null, "Opção inválida");

            }     
            
            vl = 1000000000;
            tt_cx =((m[1][0]*100)+(m[1][1]*50)+(m[1][2]*20)+(m[1][3]*10)+(m[1][4]*5)+(m[1][5]*2));
							
            while (vl>tt_cx){//Caso exceda o valor do total do caixa, imprime a msg "Excedeu o limite do caixa" e solicita novamente o valor
                while (vl<=1 || vl>=1001){//Limita o valor de saque entre 1 e 1000 reais.
                    vl = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque"));
                    if (vl>tt_cx){
                        JOptionPane.showMessageDialog (null, "EXCEDEU O LIMITE DO CAIXA");
                    }
                    if (vl<=1 || vl>=1001){
                        JOptionPane.showMessageDialog(null, "Escolha valores de saque entre R$ 2,00 à R$ 1.000,00");
                    }
                }
            }         
                
            JOptionPane.showMessageDialog (null, "Valor do saque solicitado: R$ "+vl);
            if (bk==1){                
                m[5][0]=m[5][0]+1; // contador 1
                m[2][0] = m[2][0]+vl; // Total dos saques no BB           
                if (vl>m[3][4]){ // Maior valor de saque no BB
                    m[3][4] = vl;                    
                }                
                if(vl<min1){ // Menor valor de saque no BB
                    min1 = vl;                     
                    m[3][5]=min1;                    
                }                
                System.out.println(m[5][0]);                
            }           
            
            if (bk==2){	
                m[5][1]=m[5][1]+1; // contador 2
                m[2][1] = m[2][1]+vl; // Total dos saques no Santander
                if (vl>m[4][0]){ // Maior valor de saque no Santander
                    m[4][0]=vl;
                }
                if(vl<min2){ // Menor valor de saque no Santander
                    min2 = vl;
                    m[4][1] = min2;
                }                
                System.out.println(m[5][1]);
            }
            if(bk==3){
                m[5][2]=m[5][2]+1; // contador 3
                m[2][2] = m[2][2]+vl; // Total dos saques no Itaú         
                if (vl>m[4][2]){ // Maior valor de saque no Itaú
                    m[4][2]=vl;                    
                }
                if (vl<min3){ // Menor valor de saque no Itaú
                    min3 = vl;
                    m[4][3] = min3;
                }                
                System.out.println(m[5][2]);
            }
            if(bk==4){
                m[5][3]=m[5][3]+1; // contador 4
                m[2][3] = m[2][3]+vl; // Total dos saques na CEF          
                if (vl>m[4][4]){ // Maior valor de saque na CEF
                    m[4][4]=vl;
                }
                if(vl<min4){ // Menor valor de saque na CEF
                    min4 = vl;
                    m[4][5] = min4;
                }                
                System.out.println(m[5][3]);
            }
            
            m[2][4] = m[2][0]+m[2][1]+m[2][2]+m[2][3]; // Total de saques em todos os bancos
            m[2][5] = tt_cx -(m[2][4]); // Sobra do caixa
            m[3][0] = m[2][0]/m[5][0]; // Média de saques do Banco do Brasil
	    m[3][1] = m[2][1]/m[5][1]; // Média de saques do Santander
            m[3][2] = m[2][2]/m[5][2]; // Média de saques do Itaú
            m[3][3] = m[2][3]/m[5][3]; // Média de saques da CEF
            Resp = Integer.parseInt(JOptionPane.showInputDialog("Deseja escolher as notas? \n Digite 1 para sim e 2 para não"));
            if (Resp==1){ // Distribui as notas de acordo com a escolha do usuário
		JOptionPane.showMessageDialog(null, "                                                                                                     Notas Disponíveis                                                                                          \n ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- \n " + m[1][0] + " notas de R$ 100,00 " + m[1][1] + " notas de R$ 50,00 " + m[1][2] + " notas de R$ 20,00 " + m[1][3] + " notas de R$ 10,00 " + m[1][4] + " notas de R$ 5,00 " + m[1][5] + " notas de R$ 2,00 \n ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------  ");
		while (sum!=vl){	
								
                    n100 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de notas de R$ 100,00")); 
                    n50 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de notas de R$ 50,00"));
                    n20 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de notas de R$ 20,00"));
                    n10 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de notas de R$ 10,00"));
                    n5 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de notas de R$ 5,00"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de notas de R$ 2,00"));
                    sum = (n100*100)+(n50*50)+(n20*20)+(n10*10)+(n5*5)+(n2*2);
                    if (sum!=vl){
			JOptionPane.showMessageDialog(null, "A soma das notas excede o valor do saque solicitado, escolha novamente o valor! \n");
                    }
                }
                m[1][0] = m[1][0]-n100;
                m[1][1] = m[1][1]-n50;
                m[1][2] = m[1][2]-n20;
                m[1][3] = m[1][3]-n10;
                m[1][4] = m[1][4]-n5;
                m[1][5] = m[1][5]-n2;
            }else{ // Distribui as notas automaticamente, obedecendo o critério do maior para o menor
                while (vl >= 100){                    
                    if(m[1][0]>0){
                        if (vl % 5!=0){
                            vl=vl-2;
                            n2=n2+1;
                            m[1][5] = m[1][5]-1;
                        }else{
                            n100=n100+1;
                            vl=vl-100;
                            m[1][0] = m[1][0]-1;                            
                        }
                    }else{    
                        if (vl % 5!=0){
                            vl=vl-2;
                            n2=n2+1;
                            m[1][5] = m[1][5]-1;
                        }else{
                            if(m[1][1]>0){
                                n50=n50+1;
                                vl=vl-50;
                                m[1][1] = m[1][1]-1;                            
                            }else{
                                if(m[1][2]>0){
                                    n20=n20+1;
                                    vl=vl-20;
                                    m[1][2] = m[1][2]-1; 
                                }else{
                                    if(m[1][3]>0){
                                        n10=n10+1;
                                        vl=vl-10;
                                        m[1][3] = m[1][3]-1;
                                    }else{
                                        if(m[1][4]>0){
                                            n5=n5+1;
                                            vl=vl-5;
                                            m[1][4] = m[1][4]-1;
                                        }else{
                                            if(m[1][5]>0){
                                                n2=n2+1;
                                                vl=vl-2;
                                                m[1][5] = m[1][5]-1;
                                            }else{
                                                JOptionPane.showMessageDialog(null, "Não há notas suficientes para o saque! ");
                                            }                                            
                                        }
                                    }
                                }
                            }
                        }
                    }
                }               
                while (vl >= 50){                    
                    if (m[1][1]>0){
                        if (vl % 5 != 0){
                            vl = vl -2;
                            n2=n2+1;                            
                            m[1][5] = m[1][5]-1;
                        }else{
                            n50=n50+1;
                            vl=vl-50;
                            m[1][1] = m[1][1]-1;
                        }
                    }else{
                        if (vl % 5 != 0){
                            vl = vl -2;
                            n2=n2+1;                            
                            m[1][5] = m[1][5]-1;
                        }else{
                            if(m[1][2]>0){
                                n20=n20+1;
                                vl=vl-20;
                                m[1][2] = m[1][2]-1;                        
                            }else{
                                if(m[1][3]>0){
                                    n10=n10+1;
                                    vl=vl-10;
                                    m[1][3] = m[1][3]-1;
                                }else{
                                    if(m[1][4]>0){
                                        n5=n5+1;
                                        vl=vl-5;
                                        m[1][4] = m[1][4]-1; 
                                    }else{
                                        if(m[1][5]>0){
                                            n2=n2+1;
                                            vl=vl-2;
                                            m[1][5] = m[1][5]-1;                                        
                                        }else{
                                            JOptionPane.showMessageDialog(null, "Não há notas suficientes para o saque! ");
                                        }
                                    }                                    
                                }
                            }                            
                        }
                    }
                }
                while(vl >=20){
                    if(m[1][2]>0){
                        if(vl % 5!= 0){
                            vl = vl-2;
                            n2=n2+1;                            
                            m[1][5] = m[1][5]-1;                            
                        }else{
                            n20=n20+1;
                            vl=vl-20;
                            m[1][2] = m[1][2]-1; 
                        }
                    }else{ 
                        if (vl % 5!=0){
                            vl=vl-2;
                            n2=n2+1;
                            m[1][5] = m[1][5]-1;
                        }else{
                            if(m[1][3]>0){
                                n10=n10+1;
                                vl=vl-10;
                                m[1][3] = m[1][3]-1;
                            }else{
                                if(m[1][4]>0){
                                    n5=n5+1;
                                    vl=vl-5;
                                    m[1][4] = m[1][4]-1;                                
                                }else{
                                    if(m[1][5]>0){
                                        n2=n2+1;
                                        vl=vl-2;
                                        m[1][5] = m[1][5]-1;
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Não há notas suficientes para o saque! ");
                                    }
                                }
                            }                  
                        }
                    }
                }
                while (vl >=10){
                    if (vl % 5!=0){
                        if(m[1][5]>0){
                            n2=n2+1;
                            vl=vl-2;
                            m[1][5] = m[1][5]-1;
                        }else{
                            if(m[1][3]>0){
                                n10=n10+1;
                                vl=vl-10;
                                m[1][3] = m[1][3]-1;
                            }else{
                                if(m[1][4]>0){
                                    n5=n5+1;
                                    vl=vl-5;
                                    m[1][4] = m[1][4]-1;
                                }else{
                                    if(m[1][5]>0){
                                        n2=n2+1;
                                        vl=vl-2;
                                        m[1][5] = m[1][5]-1;
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Não há notas suficientes para o saque! ");
                                    }
                                }
                            }
                        }
                    }else{
                        if(m[1][3]>0){
                                n10=n10+1;
                                vl=vl-10;
                                m[1][3] = m[1][3]-1;
                        }else{
                            if(m[1][4]>0){
                                n5=n5+1;
                                vl=vl-5;
                                m[1][4] = m[1][4]-1;
                            }else{
                                if(m[1][5]>0){
                                    n2=n2+1;
                                    vl=vl-2;
                                    m[1][5] = m[1][5]-1;
                                }else{
                                    JOptionPane.showMessageDialog(null, "Não há notas suficientes para o saque! ");
                                }                               
                            }
                        }
                    }
                }
                while (vl >=5){
                    if (vl % 2==0){
                        if(m[1][5]>0){
                            n2=n2+1;
                            vl=vl-2;
                            m[1][5] = m[1][5]-1;
                        }else{
                            JOptionPane.showMessageDialog(null, "Não há notas suficientes para o saque! ");
                        }
                    }else{
                        if(m[1][4]>0){
                            n5=n5+1;
                            vl=vl-5;
                            m[1][4] = m[1][4]-1;
                        }else{
                            JOptionPane.showMessageDialog(null,"Não há notas suficientes para o saque! ");
                        }
                    }
                }
                while (vl >=2){
                    if(m[1][5]>0){
                        n2=n2+1;
                        vl=vl-2;
                        m[1][5] = m[1][5]-1;
                    }else{
                        JOptionPane.showMessageDialog(null,"Não há notas suficientes para o saque! ");
                    }
                }
            }					
            JOptionPane.showMessageDialog(null, n100+ " Notas de R$ 100,00 \n "+n50+ " Notas de R$ 50,00 \n "+n20+ " Notas de R$ 20,00 \n "+n10+ " Notas de R$ 10,00 \n "+n5+ " Notas de R$ 5,00 \n "+n2+ " Notas de R$ 2,00");
            m[5][4]=m[5][4]+1;
            System.out.println(m[5][4]);
            }else{
                JOptionPane.showMessageDialog (null, "A quantidade de saques diário foi excedido! \n ");
	    }
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossos serviços! Volte sempre!");
            return m;
    }
    public static void Estatistica(double m[][]){
        String exibe;
        exibe = "";
        exibe = ("                                ESTATÍSTICAS                                  ");
        exibe += (" \n ");
        exibe += ("\n O total de operações no Banco do Brasil foi: "+m[5][0]);
        exibe += ("\n O total de operações no Santander foi: "+m[5][1]);
        exibe += ("\n O total de operações no Itaú foi: "+m[5][2]);
        exibe += ("\n O total de operações na Caixa Economica Federal foi: "+m[5][3]);
        exibe += ("\n O valor total dos saques no Banco do Brasil foi: R$"+ m[2][0]);
	exibe += ("\n O valor total dos saques no Santander foi: R$"+m[2][1]);
	exibe += ("\n O valor total dos saques no Itaú foi: R$"+m[2][2]);
	exibe += ("\n O valor total dos saques na Caixa Economica Federal foi: R$"+m[2][3]);
        exibe += ("\n O valor total dos saques no caixa eletrônico foi: "+m[2][4]);
	exibe += ("\n A média de saques do Banco do Brasil é: R$"+m[3][0]);
	exibe += ("\n A média de saques do Santander é: R$"+m[3][1]);
	exibe += ("\n A média de saques do Itaú é: R$"+m[3][2]);
	exibe += ("\n A média de saques da Caixa Economica Federal é: R$"+m[3][3]);
	exibe += ("\n O maior valor sacado no Banco do Brasil foi: R$"+m[3][4]);
	exibe += ("\n O menor valor sacado no Banco do Brasil foi: R$"+m[3][5]);
	exibe += ("\n O maior valor sacado no Santander foi: R$"+m[4][0]);
	exibe += ("\n O menor valor sacado no Santander foi: R$"+m[4][1]);
	exibe += ("\n O maior valor sacado no Itaú foi: R$"+m[4][2]);
	exibe += ("\n O menor valor sacado no Itaú foi: R$"+m[4][3]);
	exibe += ("\n O maior valor sacado na Caixa Economica Federal foi: R$"+m[4][4]);
	exibe += ("\n O menor valor sacado na Caixa Economica Federal foi: R$"+m[4][5]);
	exibe += ("\n O total da sobra do Caixa Eletronico é: R$"+m[2][5]); 
        JOptionPane.showMessageDialog(null, exibe);
    }

}
