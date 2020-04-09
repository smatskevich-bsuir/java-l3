package fleet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Controller {
	
	private Destroyer destroyer = new Destroyer("Aist", 20);
	private Carrier carrier = new Carrier("Zybr", 80);
	
	public void connectTorpedoButton(final JButton button) {
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	boolean result = destroyer.launchTorpedo();
            	
            	if(result)
            		JOptionPane.showMessageDialog(null, "������� ��������!");
            	else 
            		JOptionPane.showMessageDialog(null, "�� ������� ��������� �������!");
            }
		});
	}
	
	public void connectSendPlaneButton(final JButton button) {
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	boolean result = carrier.sendPlane();
            	
            	if(result)
            		JOptionPane.showMessageDialog(null, "������ �������! ���� ����������!");
            	else 
            		JOptionPane.showMessageDialog(null, "�� ������� ��������� ������!");
            }
		});
	}
	
	public void connectCarrierShootButton(final JButton button) {
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	carrier.shoot();
            	JOptionPane.showMessageDialog(null, "������� ���������� ����������!");
            }
		});
	}
	
	public void connectCarrierSwimButton(final JButton button) {
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	carrier.swim();
            	JOptionPane.showMessageDialog(null, "��������� ������� ������ �������!");
            }
		});
	}
	
	public void connectDestroyerShootButton(final JButton button) {
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	destroyer.shoot();
            	JOptionPane.showMessageDialog(null, "���� ���������� ���������!");
            }
		});
	}
	
	public void connectDestroyerSwimButton(final JButton button) {
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	destroyer.swim();
            	JOptionPane.showMessageDialog(null, "������� ������� ������ �������!");
            }
		});
	}

}
