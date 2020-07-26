//package com.mingrisoft;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JTable;

public class ClassInfo extends JFrame {
    
    /**
     * 
     */
    private static final long serialVersionUID = -284795390118429917L;
    private JPanel contentPane;
    private JTable table;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ClassInfo frame = new ClassInfo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     */
    public ClassInfo() {
        setTitle("Class Inofrmation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 392, 223);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        
        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);
        scrollPane.setViewportView(getTable());
    }
    
    private JTable getTable() {
        if (table == null) {
            table = new JTable();
            table.setRowHeight(23);
            String[] columns = { "name", "gender", "BOD" };
            
            DefaultTableModel model = new DefaultTableModel(columns, 0);
            table.setModel(model);
            List<String> students = getStudents();
            for (String info : students) {
                String[] args = info.split(",");
                model.addRow(args);
            }
        }
        return table;
    }
    
    private List<String> getStudents() {
        
        List<String> list = new ArrayList<String>();
        list.add("John,male,1981-1-23");
        list.add("Lily,female,1981-4-5");
        list.add("Lucy,female,1981-7-8");
        list.add("Bill,male,1981-10-14");
        list.add("Steve,male,1981-4-22");
        list.add("Jim,male,1981-1-3");
        return list;
    }
}
