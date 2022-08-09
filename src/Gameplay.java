
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Popup;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

	private boolean play = false;
	private Integer score;
	private int totalBricks = 48;
	private Timer timer;
	private int delay = 3;
	private int playerX = 310;
	private int ballposX = 350;
	private int ballposY = 350;
	private int ballXdir;
	private int ballYdir = +2;
	private MapGenerator map;
	public String scores = "0";
	Popup over;
	public int level;
	JFrame obj = new JFrame();

	public Gameplay(boolean fl, int levl) {

		obj.setResizable(false);
		obj.setBounds(0, 0, 710, 610);
		obj.setTitle("Brick Breaker");
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(this);
		map = new MapGenerator(4, 12);
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
		level = levl;

	}

	public void gameover(String scores, int level) {
		JFrame jFrame = new JFrame();
		JLabel t = new JLabel();
		JLabel t1 = new JLabel();
		JDialog jd = new JDialog(jFrame);
		jd.setBounds(180, 100, 400, 150);

		t.setText(" YOUR SCORE");
		t1.setText(scores);
		t.setBounds(100, 200, 200, 50);
		t.setFont(new Font("Serif", Font.BOLD, 20));
		t1.setFont(new Font("Serif", Font.BOLD, 25));

		JButton jButton = new JButton();
		JButton nextButton = new JButton();
		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jd.setVisible(false);
			}
		});

		jd.add(jButton);

		JButton jButtonbk = new JButton("back ");
		JButton jButtonre = new JButton("replay ");

		JPanel bpanel = new JPanel();
		bpanel.setBounds(10, 10, 200, 100);
		bpanel.setBackground(Color.gray);

		JPanel scrPanel = new JPanel();
		scrPanel.setBounds(50, 200, 200, 50);
		scrPanel.setBackground(Color.gray);

		jButtonbk.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
		jButtonbk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Knob Left.png"))); // NOI18N
		jButtonbk.setText("back ");
		jButtonbk.setBackground(Color.BLACK);
		jButtonbk.setForeground(Color.white);
		jButtonbk.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonbkActionPerformed(evt);
			}

			private void jButtonbkActionPerformed(ActionEvent evt) {
				jd.setVisible(false);
				jButonbkActionPerformed(evt);

			}
		});
		jButtonbk.setBounds(100, 10, 50, 50);

		jButtonre.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
		jButtonre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Knob Loop On.png"))); // NOI18N
		jButtonre.setText("replay ");
		jButtonre.setBackground(Color.BLACK);
		jButtonre.setForeground(Color.white);
		jButtonre.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonreActionPerformed(evt);
			}

			public void jButtonreActionPerformed(ActionEvent evt) {
				jd.setVisible(false);

			}
		});
		jButtonre.setBounds(70, 10, 50, 100);

		// player won

		nextButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
		nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Knob Forward.png"))); // NOI18N
		nextButton.setText("next ");
		nextButton.setBackground(Color.BLACK);
		nextButton.setForeground(Color.white);
		if (level == 2) {
			nextButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jd.setVisible(false);
				}
			});
		}

		nextButton.setBounds(180, 50, 50, 50);

		bpanel.add(jButtonbk);
		bpanel.add(jButtonre);
		bpanel.add(nextButton);
		jd.add(bpanel);

		scrPanel.add(t);
		scrPanel.add(t1);

		jd.setVisible(true);

	}

	public void start() {
		JFrame jFrame = new JFrame();

		JDialog jd = new JDialog(jFrame);

		jd.setBounds(200, 200, 350, 200);
		JButton jButton = new JButton();

		JLabel t = new JLabel();
		JLabel t1 = new JLabel();

		t.setText("Press (enter) to play ");
		t1.setText("Use side arrow keys to move paddle ");
		t.setFont(new Font("Serif", Font.BOLD, 20));
		t1.setFont(new Font("Serif", Font.BOLD, 20));

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jd.setVisible(false);
			}
		});

		jd.add(jButton);
		JButton jButtonre = new JButton("play");

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 200, 100);
		panel.setBackground(Color.gray);

		jButtonre.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
		jButtonre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Knob Play.png"))); // NOI18N
		jButtonre.setText("play");
		jButtonre.setBackground(Color.BLACK);
		jButtonre.setForeground(Color.white);
		jButtonre.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}

			/**
			 * @param evt
			 */
			public void jButton1ActionPerformed(ActionEvent evt) {
				jd.setVisible(false);

			}
		});

		jButtonre.setBounds(10, 10, 10, 10);
		panel.add(t);
		panel.add(t1);
		panel.add(jButtonre);
		jd.add(panel);
		jd.setVisible(true);
		jd.setAlwaysOnTop(true);

	}

	public void jButonbkActionPerformed(ActionEvent evt) {

		obj.setVisible(false);
		Homescr h = new Homescr();
		h.setVisible(true);

	}

	public void paint(Graphics g) {
		// background
		g.setColor(Color.darkGray);
		g.fillRect(1, 1, 692, 592);
		// drawing map
		map.draw((Graphics2D) g);

		// borders
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, 1, 590);
		g.fillRect(0, 0, 692, 1);
		g.fillRect(691, 0, 1, 592);

		// the scores
		g.setColor(Color.cyan);
		g.setFont(new Font("serif", Font.BOLD, 25));
		g.drawString("" + score, 590, 30);

		// timer

		// the paddle

		if (level == 2) {
			g.setColor(Color.green);
			g.fillRect(playerX, 550, 80, 8);
		} else if (level == 1) {
			g.setColor(Color.ORANGE);
			g.fillRect(playerX, 550, 100, 8);
		}

		// the ball

		if (level == 2) {
			g.setColor(Color.CYAN);

		} else if (level == 1) {
			g.setColor(Color.GREEN);

		}
		g.fillOval(ballposX, ballposY, 20, 20);

		// when you won the game
		if (totalBricks <= 0) {
			play = false;
			ballposX = 320;
			ballposY = 400;
			g.setColor(Color.MAGENTA);
			g.setFont(new Font("serif", Font.BOLD, 30));
			g.drawString("You Won", 260, 300);
			g.drawString("Game Over, Scores: " + score, 190, 330);

			setScore(score);
			scores = score.toString();
			level = 2;
			gameover(scores, level);
		}

		// when you lose the game
		if (ballposY > 570) {
			play = false;
			ballposX = 350;
			ballposY = 400;

			g.setColor(Color.RED);
			g.setFont(new Font("serif", Font.BOLD, 30));
			g.drawString("Game Over, Scores: " + score, 190, 300);

			setScore(score);
			scores = score.toString();
			level = 1;
			gameover(scores, level);

		}

		g.dispose();
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (playerX >= 600) {
				playerX = 600;
			} else {
				moveRight();
			}
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (playerX < 10) {
				playerX = 10;
			} else {
				moveLeft();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			if (!play) {

				play = true;
				ballposX = 350;
				ballposY = 400;
				ballYdir = +1;
				ballXdir = 0;
				playerX = 310;
				score = 0;

				if (level == 1) {

					map = new MapGenerator(4, 7);
					totalBricks = 28;

				} else if (level == 2) {

					map = new MapGenerator(4, 14);
					totalBricks = 48;
				}

				repaint();
			}
		}

	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public void moveRight() {
		play = true;
		playerX += 20;
	}

	public void moveLeft() {
		play = true;
		playerX -= 20;
	}

	public void actionPerformed(ActionEvent e) {
		timer.start();

		if (play) {
			if (new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 30, 8))) {
				ballYdir = -ballYdir;
				ballXdir = -1;
			} else if (new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX + 70, 550, 30, 8))) {
				ballYdir = -ballYdir;
				ballXdir = ballXdir + 1;
			} else if (new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX + 30, 550, 40, 8))) {
				ballYdir = -ballYdir;
			}

			// check map collision with the ball
			A: for (int i = 0; i < map.map.length; i++) {
				for (int j = 0; j < map.map[0].length; j++) {
					if (map.map[i][j] > 0) {
						// scores++;
						int brickX = j * map.brickWidth + 80;
						int brickY = i * map.brickHeight + 50;
						int brickWidth = map.brickWidth;
						int brickHeight = map.brickHeight;

						Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
						Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
						Rectangle brickRect = rect;

						if (ballRect.intersects(brickRect)) {
							map.setBrickValue(0, i, j);
							score += 5;
							totalBricks--;

							// when ball hit right or left of brick
							if (ballposX + 19 <= brickRect.x || ballposX + 1 >= brickRect.x + brickRect.width) {
								ballXdir = -ballXdir;
							}
							// when ball hits top or bottom of brick
							else {
								ballYdir = -ballYdir;
							}

							break A;
						}
					}
				}
			}

			ballposX += ballXdir;
			ballposY += ballYdir;

			if (ballposX < 0) {
				ballXdir = -ballXdir;
			}
			if (ballposY < 0) {
				ballYdir = -ballYdir;
			}
			if (ballposX > 670) {
				ballXdir = -ballXdir;
			}

			repaint();
		}
	}

	public void setScore(int sc) {

		// Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/brick_game", "root", "");
			// the mysql insert statement
			String query = " insert into login (score)" + " values (?)";
			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setInt(1, sc);
			// execute the preparedstatement
			preparedStmt.execute();

			con.close();

		} catch (Exception ex) {

		}

	}
}
