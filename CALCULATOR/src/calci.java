
		// TODO Auimport java.awt.Font;
		import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

		public class calci
		{	
			public static void main(String[] args) {
				JFrame frame = new JFrame("Calculator1");
				frame.setVisible(true);
				frame.setSize(480,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Font font1 = new Font("SansSerif", Font.BOLD, 40);
				
		     //Text Area
				JTextField t;  
			    t=new JTextField("");  
			    t.setBounds(20,25,430,150); 
			    t.setFont(font1);
		        frame.add(t);  
			    frame.setLayout(null);  
			    frame.setVisible(true); 
			    t.setHorizontalAlignment(JTextField.RIGHT);
				
			    //Decimal button
				JButton bdec = new JButton(".");  
			    bdec.setBounds(20,410,100,50);  
			    frame.add(bdec);  
			    frame.setLayout(null);  
			    frame.setVisible(true);
			    bdec.addActionListener(new ActionListener(){  
			        public void actionPerformed(ActionEvent e){  
			        	t.setText(t.getText().concat("."));  
		            }  
		        });  	
			   
			    
			    // Zero Button
			    JButton b0 = new JButton("0");  
			    b0.setBounds(130,410,100,50);  
			    frame.add(b0);  
			    frame.setLayout(null);  
			    frame.setVisible(true);
			    b0.addActionListener(new ActionListener(){  
			      public void actionPerformed(ActionEvent e){  
			        t.setText(t.getText().concat("0"));  
			            }  
			        });  
			    
			    // Equals Button
			    JButton beq = new JButton("=");  
			    beq.setBounds(240,410,100,50);  
			    frame.add(beq);  
			    frame.setLayout(null);  
			    frame.setVisible(true);	
			    beq.addActionListener(new ActionListener(){  
			        public void actionPerformed(ActionEvent e){  
			               //t.setText("=");
			        	ScriptEngineManager man=new ScriptEngineManager();
			        	ScriptEngine en=man.getEngineByName("js");
			        	try {
							Object b=en.eval(t.getText());
							//System.out.println(b);
						
							t.setText(b.toString());
						} catch (ScriptException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
							
						}
			        	
			            }  
			        });  
			    
			 // Plus Button 
			 // Special Button
			 		    
			 		    JButton badd = new JButton("+");  
			 		    badd.setBounds(350,410,100,50);  
			 		    frame.add(badd);  
			 		    frame.setLayout(null);  
			 		    frame.setVisible(true);
			 		   badd.addActionListener(new ActionListener(){  
					        public void actionPerformed(ActionEvent e){  
					        	 t.setText(t.getText().concat("+"));    
					            }  
					        });  
			 		       
				//First Button
				    JButton b1 = new JButton("1");  
				    b1.setBounds(20,350,100,50);  
				    frame.add(b1);  
				    frame.setLayout(null);  
				    frame.setVisible(true);
				    b1.addActionListener(new ActionListener(){  
				        public void actionPerformed(ActionEvent e){  
				                t.setText(t.getText().concat("1"));  
				            }  
				        });  
				  
				 
				// Second button
				    JButton b2 = new JButton("2");  
				    b2.setBounds(130,350,100,50);  
				    frame.add(b2);  
				    frame.setLayout(null);  
				    frame.setVisible(true);
				    b2.addActionListener(new ActionListener(){  
				        public void actionPerformed(ActionEvent e){  
				                t.setText(t.getText().concat("2"));  
				            }  
				        });  
				//Third Button 
				    JButton b3 = new JButton("3");  
				    b3.setBounds(240,350,100,50);  
				    frame.add(b3);  
				    frame.setLayout(null);  
				    frame.setVisible(true);
				    b3.addActionListener(new ActionListener(){  
				        public void actionPerformed(ActionEvent e){  
				        	 t.setText(t.getText().concat("3"));   
				            }  
				        });  
				 // Subtract Button 
					// special Button
				    
					    
					    JButton bsub = new JButton("-");  
					    bsub.setBounds(350,350,100,50);  
					    frame.add(bsub);  
					    frame.setLayout(null);  
					    frame.setVisible(true); 
					    bsub.addActionListener(new ActionListener(){  
				        public void actionPerformed(ActionEvent e){  
				        	t.setText(t.getText().concat("-"));  
				            }  
				        });  
				
				//Fourth Button
				    JButton b4 = new JButton("4");  
				    b4.setBounds(20,288,100,50);  
				    frame.add(b4);  
				    frame.setLayout(null);  
				    frame.setVisible(true);
				    b4.addActionListener(new ActionListener(){  
				        public void actionPerformed(ActionEvent e){  
				        	 t.setText(t.getText().concat("4"));  
				            }  
				        });  
				 // Fifth Button
				    JButton b5 = new JButton("5");  
				    b5.setBounds(130,288,100,50);  
				    frame.add(b5);  
				    frame.setLayout(null);  
				    frame.setVisible(true);
				    b5.addActionListener(new ActionListener(){  
				        public void actionPerformed(ActionEvent e){  
				        	 t.setText(t.getText().concat("5"));  
				            }  
				        });  
				 //Sixth Button
				    JButton b6 = new JButton("6");  
				    b6.setBounds(240,288,100,50);  
				    frame.add(b6);  
				    frame.setLayout(null);  
				    frame.setVisible(true);
				    b6.addActionListener(new ActionListener(){  
				        public void actionPerformed(ActionEvent e){  
				        	 t.setText(t.getText().concat("6"));  
				            }  
				        });  
				    
					//Multiply Button
					//Special button
					    JButton bmux = new JButton("*");  
					    bmux.setBounds(350,288,100,50);  
					    frame.add(bmux);  
					    frame.setLayout(null);  
					    frame.setVisible(true); 
					    bmux.addActionListener(new ActionListener(){  
					    public void actionPerformed(ActionEvent e){  
					    	t.setText(t.getText().concat("*"));  
					            }  
					        });  
				    
				// Seventh Button 
				    JButton b7 = new JButton("7");  
				    b7.setBounds(20,226,100,50);  
				    frame.add(b7);  
				    frame.setLayout(null);  
				    frame.setVisible(true);
				    b7.addActionListener(new ActionListener(){  
				        public void actionPerformed(ActionEvent e){  
				        	 t.setText(t.getText().concat("7"));  
				            }  
				        });  
				// Eight Button
				    JButton b8 = new JButton("8");  
				    b8.setBounds(130,226,100,50);  
				    frame.add(b8);  
				    frame.setLayout(null);  
				    frame.setVisible(true);
				    b8.addActionListener(new ActionListener(){  
				        public void actionPerformed(ActionEvent e){  
				        	 t.setText(t.getText().concat("8"));  
				            }  
				        });  
				// Nine Button     
				    JButton b9 = new JButton("9");  
				    b9.setBounds(240,226,100,50);  
				    frame.add(b9);  
				    frame.setLayout(null);  
				    frame.setVisible(true);
				    b9.addActionListener(new ActionListener(){  
				        public void actionPerformed(ActionEvent e){  
				        	 t.setText(t.getText().concat("9"));  
				            }  
				        });  
				    
				// Division Button
				//Special Button    
				    JButton bdiv = new JButton("/");  
				    bdiv.setBounds(350,226,100,50);  
				    frame.add(bdiv);  
				    frame.setLayout(null);  
				    frame.setVisible(true);
				    bdiv.addActionListener(new ActionListener(){  
				     public void actionPerformed(ActionEvent e){  
				    	 t.setText(t.getText().concat("/"));  
				            }  
				        });  
			// making window size fixed
				    frame.setResizable(false);
				    
				    
			  // Clear Button
			 // Special Button
				    JButton bclr = new JButton("C");  
				    bclr.setBounds(350,175,100,50);  
				    frame.add(bclr);  
				    frame.setLayout(null);  
				    frame.setVisible(true);
				    bclr.addActionListener(new ActionListener(){  
				    	 public void actionPerformed(ActionEvent e){  
					    	 t.setText("");  
					            }  
					        });  
				    }
				     
				    
				    
				    
				    
			}
