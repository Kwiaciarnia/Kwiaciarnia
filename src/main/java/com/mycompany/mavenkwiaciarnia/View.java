/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class View extends JFrame implements FocusListener{
    JButton exit;
    JButton individual;
    JButton company;
    JTextField indCapacity;
    JTextField comBoxCapacity;
    JTextField comConCapacity;
    JButton basket;
    JButton cashDesk;
    JComboBox comboCashDesk;
    JButton okReceipt;
    JTextArea receipt;
    JScrollPane receiptScrollPane;
    JComboBox names;
    JComboBox colours;
    JComboBox accessories;
    JButton addAccessory;
    JButton addFlower;
    JButton add;
    JComboBox flowers;
    JButton remove;
    JButton okBasket;
    JList<String> accessoriesList;
    DefaultListModel<String> listModel;
    JScrollPane accessoriesPane;
    JButton doneFlower;
    JLabel yourBasket;

    public View() {
        super("Florist's");
        setResizable(false);
        setSize(800, 600);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(d.width/2-400, d.height/2-300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        exit = new JButton("EXIT");
        exit.setVisible(true);
        exit.setBounds(250 , 150+100+100, 300 , 50);
        exit.setActionCommand("EXIT");
        
        individual = new JButton("INDIVIDUAL CUSTOMER");
        individual.setVisible(true);
        individual.setBounds(250 , 150, 300 , 50);
        individual.setActionCommand("INDIVIDUAL");
        
        company = new JButton("COMPANY CUSTOMER");
        company.setVisible(true);
        company.setBounds(250 , 150+100, 300 , 50);
        company.setActionCommand("COMPANY");
        
        indCapacity = new JTextField("Write you basket capacity");
        indCapacity.setBounds(250, 100, 300, 50);
        indCapacity.addFocusListener(this);
        
        comBoxCapacity = new JTextField("Write you box capacity");
        comBoxCapacity.setBounds(250, 200, 150, 50);
        comBoxCapacity.addFocusListener(this);
        
        comConCapacity = new JTextField("Write you container capacity");
        comConCapacity.setBounds(250+150, 200, 150, 50);
        comConCapacity.addFocusListener(this);
        
        basket = new JButton("BASKET");
        basket.setVisible(false);
        basket.setBounds(250 , 150+50, 300 , 50);
        basket.setActionCommand("BASKET");
        
        cashDesk = new JButton("CASHDESK");
        cashDesk.setVisible(false);
        cashDesk.setBounds(250 + 150 , 350, 300 , 50);
        cashDesk.setActionCommand("CASHDESK");
        
        comboCashDesk = new JComboBox();
        comboCashDesk.setVisible(false);
        comboCashDesk.setBounds(100, 350, 300, 50);
        
        okReceipt = new JButton("OK");
        okReceipt.setVisible(false);
        okReceipt.setBounds(250 , 500, 300 , 50);
        okReceipt.setActionCommand("OKRECEIPT");
        
        receipt = new JTextArea("");
        receipt.setVisible(true);
        receipt.setEditable(false);
        receipt.setLineWrap(true);
        
        receiptScrollPane = new JScrollPane(receipt);
        receiptScrollPane.setBounds(50, 50, 700, 400);
        receiptScrollPane.setVisible(false);
        
        names = new JComboBox();
        names.setBounds(50, 50, 300, 50);
        names.addItem("Daisy");
        names.addItem("Lily");
        names.addItem("Narcissus");
        names.addItem("Tulip");
        names.setVisible(false);
        
        accessories = new JComboBox();
        accessories.setBounds(100, 50, 300, 50);
        accessories.addItem("Bow");
        accessories.addItem("Net");
        accessories.addItem("Ribbon");
        accessories.setVisible(false);
        
        colours = new JComboBox();
        colours.setBounds(50, 100, 300, 50);
        for(NameColourClass.Colour c : NameColourClass.Colour.values()){
            colours.addItem(c.toString());
        }
        colours.setVisible(false);
        
        addAccessory = new JButton("ADD");
        addAccessory.setVisible(false);
        addAccessory.setBounds(400, 50, 300 , 50);
        addAccessory.setActionCommand("ADDACCESSORY");
        
        addFlower = new JButton("ADD FLOWER");
        addFlower.setVisible(false);
        addFlower.setBounds(250, 75, 300 , 50);
        addFlower.setActionCommand("ADDFLOWER");
        
        add = new JButton("ADD");
        add.setVisible(false);
        add.setBounds(250, 75, 300 , 50);
        add.setActionCommand("ADD");
        
        remove = new JButton("REMOVE");
        remove.setVisible(false);
        remove.setBounds(400, 300, 200 , 50);
        remove.setActionCommand("REMOVE");
        
        flowers = new JComboBox();
        flowers.setBounds(10, 300, 390, 50);
        flowers.setVisible(false);
        
        yourBasket = new JLabel("Your basket");
        yourBasket.setBounds(10, 250, 390, 50);
        yourBasket.setFont(new Font("Garamond", Font.PLAIN, 30));
        yourBasket.setVisible(false);
        
        okBasket = new JButton("OK");
        okBasket.setVisible(false);
        okBasket.setBounds(250 , 500, 300 , 50);
        okBasket.setActionCommand("OKBASKET");
        
        listModel = new DefaultListModel();
        
        accessoriesList = new JList<>(listModel);
        accessoriesList.setVisible(true);
        
        accessoriesPane = new JScrollPane(accessoriesList);
        accessoriesPane.setBounds(100, 200, 300, 350);
        accessoriesPane.setVisible(false);
        
        doneFlower = new JButton("DONE");
        doneFlower.setVisible(false);
        doneFlower.setBounds(400, 300, 300 , 50);
        doneFlower.setActionCommand("DONEFLOWER");
        
        getLayeredPane().add(exit,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(individual,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(company,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(indCapacity,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(comBoxCapacity,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(comConCapacity,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(basket,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(cashDesk,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(comboCashDesk,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(okReceipt,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(receiptScrollPane,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(names,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(colours,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(add,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(remove,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(flowers,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(okBasket,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(addAccessory,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(addFlower,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(accessories,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(accessoriesPane,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(doneFlower,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(yourBasket,JLayeredPane.MODAL_LAYER);
    }
    
    public String getIndCapacity(){
        return indCapacity.getText();
    }
    
    public String getComBoxCapacity(){
        return comBoxCapacity.getText();
    }
    
    public String getComConCapacity(){
        return comConCapacity.getText();
    }
    
    public String getNameColour(){
        return names.getSelectedItem() + " " + colours.getSelectedItem();
    }
    
    public String getDecorator(){
        return accessories.getSelectedItem().toString();
    }
    
    public void addDecoratorToList(String decorator){
        listModel.addElement(decorator);
    }
    
    public String getDecriptionOfFlowerToRemove(){
        return (String) flowers.getSelectedItem();
    }
    
    public void addActionListener(ActionListener listener){
        exit.addActionListener(listener);
        individual.addActionListener(listener);
        company.addActionListener(listener);
        basket.addActionListener(listener);
        cashDesk.addActionListener(listener);
        okReceipt.addActionListener(listener);
        add.addActionListener(listener);
        remove.addActionListener(listener);
        okBasket.addActionListener(listener);
        addAccessory.addActionListener(listener);
        addFlower.addActionListener(listener);
        doneFlower.addActionListener(listener);
    }
    
    public void setMainMenu(){
        indCapacity.setText("Write you basket capacity");
        comBoxCapacity.setText("Write you box capacity");
        comConCapacity.setText("Write you container capacity");
        exit.setVisible(true);
        individual.setVisible(true);
        company.setVisible(true);
        indCapacity.setVisible(true);
        comBoxCapacity.setVisible(true);
        comConCapacity.setVisible(true);
        basket.setVisible(false);
        cashDesk.setVisible(false);
        comboCashDesk.setVisible(false);
        okReceipt.setVisible(false);
        receiptScrollPane.setVisible(false);
        names.setVisible(false);
        colours.setVisible(false);
        add.setVisible(false);
        flowers.setVisible(false);
        remove.setVisible(false);
        okBasket.setVisible(false);
        addAccessory.setVisible(false);
        addFlower.setVisible(false);
        accessories.setVisible(false);
        accessoriesPane.setVisible(false);
        doneFlower.setVisible(false);
        yourBasket.setVisible(false);
    }

    public void setShopping(List<Integer> cashDeskIDs) {
        exit.setVisible(false);
        individual.setVisible(false);
        company.setVisible(false);
        indCapacity.setVisible(false);
        comBoxCapacity.setVisible(false);
        comConCapacity.setVisible(false);
        names.setVisible(false);
        colours.setVisible(false);
        add.setVisible(false);
        flowers.setVisible(false);
        remove.setVisible(false);
        okBasket.setVisible(false);
        
        basket.setVisible(true);
        cashDesk.setVisible(true);
        comboCashDesk.setVisible(true);
        comboCashDesk.removeAllItems();
        for(Integer i : cashDeskIDs){
            comboCashDesk.addItem("Cashdesk number " + i);
        }
        okReceipt.setVisible(false);
        receiptScrollPane.setVisible(false);
        addAccessory.setVisible(false);
        addFlower.setVisible(false);
        accessories.setVisible(false);
        accessoriesPane.setVisible(false);
        doneFlower.setVisible(false);
        yourBasket.setVisible(false);
    }
    
    public int getSelectedCashDeskNumber(){
        return Integer.valueOf(comboCashDesk.getSelectedItem().toString().split(" ")[2]);
    }
    
    public void setServingCustomer(String receipt){
        exit.setVisible(false);
        individual.setVisible(false);
        company.setVisible(false);
        indCapacity.setVisible(false);
        comBoxCapacity.setVisible(false);
        comConCapacity.setVisible(false);
        basket.setVisible(false);
        cashDesk.setVisible(false);
        comboCashDesk.setVisible(false);
        
        names.setVisible(false);
        colours.setVisible(false);
        add.setVisible(false);
        flowers.setVisible(false);
        remove.setVisible(false);
        okBasket.setVisible(false);
        
        okReceipt.setVisible(true);
        this.receipt.setText(receipt);
        receiptScrollPane.setVisible(true);
        addAccessory.setVisible(false);
        addFlower.setVisible(false);
        accessories.setVisible(false);
        accessoriesPane.setVisible(false);
        doneFlower.setVisible(false);
        yourBasket.setVisible(false);
    }
    
    public void setBasket(List<Flower> flowersList){
        exit.setVisible(false);
        individual.setVisible(false);
        company.setVisible(false);
        indCapacity.setVisible(false);
        comBoxCapacity.setVisible(false);
        comConCapacity.setVisible(false);
        basket.setVisible(false);
        cashDesk.setVisible(false);
        comboCashDesk.setVisible(false);
        okReceipt.setVisible(false);
        receiptScrollPane.setVisible(false);
        
        names.setVisible(false);
        colours.setVisible(false);
        add.setVisible(true);
        flowers.setVisible(true);
        remove.setVisible(true);
        okBasket.setVisible(true);
        
        flowers.removeAllItems();
        for(Flower f : flowersList){
            flowers.addItem(f.getDescription());
        }
        addAccessory.setVisible(false);
        addFlower.setVisible(false);
        accessories.setVisible(false);
        accessoriesPane.setVisible(false);
        doneFlower.setVisible(false);
        yourBasket.setVisible(true);
    }
    
    public void setNameColourMenu(){
        exit.setVisible(false);
        individual.setVisible(false);
        company.setVisible(false);
        indCapacity.setVisible(false);
        comBoxCapacity.setVisible(false);
        comConCapacity.setVisible(false);
        add.setVisible(false);
        flowers.setVisible(false);
        remove.setVisible(false);
        okBasket.setVisible(false);
        basket.setVisible(false);
        cashDesk.setVisible(false);
        comboCashDesk.setVisible(false);
        okReceipt.setVisible(false);
        receiptScrollPane.setVisible(false);
        names.setVisible(true);
        colours.setVisible(true);
        addAccessory.setVisible(false);
        addFlower.setVisible(true);
        accessories.setVisible(false);
        accessoriesPane.setVisible(false);
        doneFlower.setVisible(false);
        yourBasket.setVisible(false);
    }
    
    public void setAddDecorators(){
        exit.setVisible(false);
        individual.setVisible(false);
        company.setVisible(false);
        indCapacity.setVisible(false);
        comBoxCapacity.setVisible(false);
        comConCapacity.setVisible(false);
        add.setVisible(false);
        flowers.setVisible(false);
        remove.setVisible(false);
        okBasket.setVisible(false);
        basket.setVisible(false);
        cashDesk.setVisible(false);
        comboCashDesk.setVisible(false);
        okReceipt.setVisible(false);
        receiptScrollPane.setVisible(false);
        names.setVisible(false);
        colours.setVisible(false);
        addAccessory.setVisible(true);
        addFlower.setVisible(false);
        accessories.setVisible(true);
        listModel.clear();
        accessoriesPane.setVisible(true);
        doneFlower.setVisible(true);
        yourBasket.setVisible(false);
    }

    @Override
    public void focusGained(FocusEvent fe) {
        if(fe.getSource() == indCapacity){
            indCapacity.setText("");
        }else if(fe.getSource() == comBoxCapacity){
            comBoxCapacity.setText("");
        }else if(fe.getSource() == comConCapacity){
            comConCapacity.setText("");
        }
    }

    @Override
    public void focusLost(FocusEvent fe) {
    
    }
}
