package fleet;

import java.awt.FlowLayout;

import javax.swing.*;  

public class Interface {
	
	private static void createAndShowGUI() {
        JFrame frame = new JFrame("������ ���������� ����������� ������");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JPanel content = packContent();
        frame.getContentPane().add(content);
        frame.pack();
        
        frame.setResizable(false);
        frame.setVisible(true);
	}
	
	private static JPanel packContent() {
		Controller controller = new Controller();
		JPanel content = new JPanel();
		content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
		
        JPanel destroyerPanel = new JPanel();
        destroyerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
        JLabel destroyerLabel = new JLabel("���������� ��������");
        destroyerPanel.add(destroyerLabel);
		
		JButton torpedoButton = new JButton("���� ������");
		controller.connectTorpedoButton(torpedoButton);
		destroyerPanel.add(torpedoButton);
		
		JButton destroyerShootButton = new JButton("����� �� ���� ������");
		controller.connectDestroyerShootButton(destroyerShootButton);
		destroyerPanel.add(destroyerShootButton);
		
		JButton destroyerSwimButton = new JButton("������� �������");
		controller.connectDestroyerSwimButton(destroyerSwimButton);
		destroyerPanel.add(destroyerSwimButton);
		
		JPanel carrierPanel = new JPanel();
		carrierPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
        JLabel carrierLabel = new JLabel("���������� ����������");
        carrierPanel.add(carrierLabel);
		
		JButton sendButton = new JButton("��������� ������");
		controller.connectSendPlaneButton(sendButton);
		carrierPanel.add(sendButton);
		
		JButton carrierShootButton = new JButton("����� �� ���� ������");
		controller.connectCarrierShootButton(carrierShootButton);
		carrierPanel.add(carrierShootButton);
		
		JButton carrierSwimButton = new JButton("������� �������");
		controller.connectCarrierSwimButton(carrierSwimButton);
		carrierPanel.add(carrierSwimButton);
		
		content.add(destroyerPanel);
		content.add(carrierPanel);
		
		return content;
	}
	
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
