
package brickbracker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;
import javax.swing.JPanel;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
    private boolean play = false;
    private int score = 0;
    
    private int totalBricks = 30;
    
    private Timer timer;
    private int delay = 8;
    
    private int playerX = 310;
    
    private int ballposx = 350;
    private int ballposy = 530;
    private int ballXdir = -1;
    private int ballYdir = -2;
    
    private MapGenerator map;
    
    public Gameplay() {
        map = new MapGenerator(3,10);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay,this);
        timer.start();
    }
    
    public void paint(Graphics g) {
        //Fondo
        g.setColor(Color.white);
        g.fillRect (1, 1, 692, 592);
        
        // Drawing map
        map.draw((Graphics2D)g);
        
        // Bordes
        g.setColor(Color.blue);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);
        
        // Puntaje
        g.setColor(Color.black);
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString("Puntos: " + score, 560, 30);
        
        
        // Paddle
        g.setColor(Color.black);
        g.fillRect(playerX, 550, 100, 8);
        
        // Bola
        g.setColor(Color.blue);
        g.fillOval(ballposx, ballposy, 20, 20);
        
        if(totalBricks <= 0) {
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g.setColor(Color.black);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("¡Has ganado!", 260, 300);
            System.out.println("Puntaje total: " + score);
            System.out.println("");
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Presiona Enter para reiniciar", 230, 350);
        }
        
        if(ballposy > 570) {
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g.setColor(Color.black);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("Fin del Juego. Puntos: " + score, 190, 300);
            
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Presiona Enter para reiniciar", 230, 350);   
        }
        
        g.dispose();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if(play) {
            if(new Rectangle(ballposx, ballposy, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))) {
               ballYdir = -ballYdir;     
            }
            
            A:for(int i = 0; i < map.map.length; i++) {
                for(int j = 0; j < map.map[0].length; j++) {
                    if(map.map[i][j] > 0) {
                        int brickX = j * map.brickwidth + 80;
                        int brickY = i * map.brickwidth + 50;
                        int brickwidth = map.brickwidth;
                        int brickheight = map.brickheight;
                        
                        Rectangle rect = new Rectangle(brickX, brickY, brickwidth, brickheight);
                        Rectangle ballRect = new Rectangle(ballposx, ballposy, 20, 20);
                        Rectangle brickRect= rect;
                        
                        if(ballRect.intersects(brickRect)) {
                            map.setBrickValue(0, i, j);
                            totalBricks--;
                            score += 5;
                            
                            if(ballposx + 19 <= brickRect.x || ballposx + 1 >= brickRect.x + brickRect.width) {
                                ballXdir = -ballXdir;
                            }else{
                                ballYdir = -ballYdir;
                            }
                            break A;
                        }
                    }
                }
            }
            ballposx += ballXdir;
            ballposy += ballYdir;
            if(ballposx < 0) {
                ballXdir = -ballXdir;
            }
            if(ballposy < 0) {
                ballYdir = -ballYdir;
            }
            if(ballposx > 670) {
                ballXdir = -ballXdir;
            }
        }
        repaint();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(playerX >=600) {
                playerX = 600;
            }else{
                moveRight();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            if(playerX < 10) {
                playerX = 10;
            }else{
                moveLeft();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            if(!play) {
                play = true;
                ballposx = 120;
                ballposy = 350;
                ballXdir = -1;
                ballYdir = -2;
                playerX = 310;
                score = 0;
                totalBricks = 30;
                map = new MapGenerator(3,10);
                
                repaint();
            }
        }
    }
    public void moveRight() {
        play = true;
        playerX += 20;
    }
    public void moveLeft() {
        play = true;
        playerX -= 20;
    }
}
