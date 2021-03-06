package org.vti.ui;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;

import org.vti.enumeration.Version;
import org.vti.util.SystemUitls;

public class MainPanel extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField urlJTextField;
	private JComboBox<String> versionJcomboBox;
	
	public MainPanel(){
		setTitle("struts2 终极漏洞利用工具  Powered By VTI");
		setSize(600,460);
		setLocationRelativeTo(null);
		setVisible(true);
		setIconImage(SystemUitls.getImage("resource/icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel urlJLabel = new JLabel("URL");

		urlJTextField = new JTextField("http://localhost/struts/login.action");
		urlJTextField.setColumns(10);
		
		String []versions=new String[]{Version.S2009.toString(),Version.S2016.toString(),Version.S2019.toString()};
		
		versionJcomboBox = new JComboBox<String>(versions);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		final ServerPanel serverPanel= new ServerPanel();
	
		final CmdPanel cmdPanel= new CmdPanel();
		
		final UploadPanel uploadPanel= new UploadPanel();
	
		final ZuploadPanel zuploadPanel= new ZuploadPanel();
		
		final FileViewPanel fileViewPanel= new FileViewPanel();
		
		tabbedPane.add("服务器信息", serverPanel);
		
		tabbedPane.add("命令执行", cmdPanel);
		
		tabbedPane.add("上传到项目根目录", uploadPanel);
	
		tabbedPane.add("自定义上传", zuploadPanel);
		
		tabbedPane.add("文件浏览", fileViewPanel);
		
		urlJTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				super.focusLost(e);
				
				serverPanel.setReqestUrl(urlJTextField.getText().trim());
				serverPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
				cmdPanel.setReqestUrl(urlJTextField.getText().trim());
				cmdPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
				uploadPanel.setReqestUrl(urlJTextField.getText().trim());
				uploadPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
				zuploadPanel.setReqestUrl(urlJTextField.getText().trim());
				zuploadPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
				fileViewPanel.setReqestUrl(urlJTextField.getText().trim());
				fileViewPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
			}
		});
		
		versionJcomboBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				super.focusLost(e);
				
				serverPanel.setReqestUrl(urlJTextField.getText().trim());
				serverPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
				cmdPanel.setReqestUrl(urlJTextField.getText().trim());
				cmdPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
				uploadPanel.setReqestUrl(urlJTextField.getText().trim());
				uploadPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
				zuploadPanel.setReqestUrl(urlJTextField.getText().trim());
				zuploadPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
				fileViewPanel.setReqestUrl(urlJTextField.getText().trim());
				fileViewPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
			}
		});
		
		this.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				super.focusLost(e);
				
				
				serverPanel.setReqestUrl(urlJTextField.getText().trim());
				serverPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
				cmdPanel.setReqestUrl(urlJTextField.getText().trim());
				cmdPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
				uploadPanel.setReqestUrl(urlJTextField.getText().trim());
				uploadPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
				zuploadPanel.setReqestUrl(urlJTextField.getText().trim());
				zuploadPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
				
				fileViewPanel.setReqestUrl(urlJTextField.getText().trim());
				fileViewPanel.setVersion(Version.valueOf(versionJcomboBox.getSelectedItem().toString()));
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(urlJLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(urlJTextField, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(versionJcomboBox, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(urlJLabel)
							.addComponent(urlJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(versionJcomboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	
	}
}
