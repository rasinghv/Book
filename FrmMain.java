import java.awt.Cursor;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmMain extends javax.swing.JFrame {

    /** Creates new form FrmMain */
    public FrmMain() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel6 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtMaxBooks = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtBorrowerName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBorrowBook = new javax.swing.JButton();
        btnReturnBook = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtISBNSearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtTitleSearch = new javax.swing.JTextField();
        txtAuthorSearch = new javax.swing.JTextField();
        btnSearchOverdue = new javax.swing.JButton();
        btnSearchAuthor = new javax.swing.JButton();
        btnSearchISBN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBookSearch = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        btnSearchStatus = new javax.swing.JButton();
        txtStatusSearch = new javax.swing.JTextField();
        btnSearchTitle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Books");

        pnlMain.setPreferredSize(new java.awt.Dimension(820, 505));
        pnlMain.setLayout(null);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(327, 327));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(45, 40));

        tblBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "ISBN", "Title", "Author", "Status", "Borrowed By", "Due Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBook.setMaximumSize(new java.awt.Dimension(90, 364));
        tblBook.setMinimumSize(new java.awt.Dimension(105, 364));
        tblBook.setPreferredSize(new java.awt.Dimension(90, 364));
        tblBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBook);

        pnlMain.add(jScrollPane1);
        jScrollPane1.setBounds(10, 166, 800, 330);
        pnlMain.add(jFileChooser1);
        jFileChooser1.setBounds(0, 0, 0, 0);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Select File");
        pnlMain.add(jLabel6);
        jLabel6.setBounds(10, 10, 115, 14);

        txtFile.setEditable(false);
        pnlMain.add(txtFile);
        txtFile.setBounds(130, 10, 270, 20);

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        pnlMain.add(btnBrowse);
        btnBrowse.setBounds(410, 10, 90, 23);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Max. Books on Shelf");
        pnlMain.add(jLabel21);
        jLabel21.setBounds(10, 40, 115, 14);

        txtMaxBooks.setText("10");
        txtMaxBooks.setEnabled(false);
        pnlMain.add(txtMaxBooks);
        txtMaxBooks.setBounds(130, 40, 151, 20);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        pnlMain.add(btnRefresh);
        btnRefresh.setBounds(510, 10, 90, 23);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Borrower Name");
        pnlMain.add(jLabel9);
        jLabel9.setBounds(600, 70, 90, 20);
        pnlMain.add(txtBorrowerName);
        txtBorrowerName.setBounds(700, 70, 110, 20);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Details"));
        jPanel2.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Book ISBN");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 20, 70, 20);
        jPanel2.add(txtISBN);
        txtISBN.setBounds(90, 20, 90, 20);
        jPanel2.add(txtTitle);
        txtTitle.setBounds(240, 20, 130, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Title");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(170, 20, 60, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Author");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(370, 20, 50, 20);
        jPanel2.add(txtAuthor);
        txtAuthor.setBounds(430, 20, 120, 20);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);
        btnAdd.setBounds(90, 50, 80, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);
        btnUpdate.setBounds(180, 50, 80, 23);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset);
        btnReset.setBounds(380, 50, 80, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);
        btnDelete.setBounds(280, 50, 80, 23);

        pnlMain.add(jPanel2);
        jPanel2.setBounds(20, 70, 560, 90);

        btnBorrowBook.setText("Borrow Selected Book");
        btnBorrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowBookActionPerformed(evt);
            }
        });
        pnlMain.add(btnBorrowBook);
        btnBorrowBook.setBounds(620, 100, 190, 23);

        btnReturnBook.setText("Return Selected Book");
        btnReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBookActionPerformed(evt);
            }
        });
        pnlMain.add(btnReturnBook);
        btnReturnBook.setBounds(620, 130, 190, 23);

        jTabbedPane1.addTab("Manage Books", pnlMain);

        jPanel1.setLayout(null);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Book ISBN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 20, 100, 20);
        jPanel1.add(txtISBNSearch);
        txtISBNSearch.setBounds(120, 20, 140, 20);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Title");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 50, 90, 20);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Author");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(420, 20, 80, 20);
        jPanel1.add(txtTitleSearch);
        txtTitleSearch.setBounds(120, 50, 140, 20);
        jPanel1.add(txtAuthorSearch);
        txtAuthorSearch.setBounds(510, 20, 140, 20);

        btnSearchOverdue.setText("Search Overdue");
        btnSearchOverdue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchOverdueActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchOverdue);
        btnSearchOverdue.setBounds(660, 80, 140, 23);

        btnSearchAuthor.setText("Search Author");
        btnSearchAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAuthorActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchAuthor);
        btnSearchAuthor.setBounds(660, 20, 140, 23);

        btnSearchISBN.setText("Search ISBN");
        btnSearchISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchISBNActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchISBN);
        btnSearchISBN.setBounds(270, 20, 140, 23);

        jScrollPane2.setMaximumSize(new java.awt.Dimension(327, 327));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(45, 40));

        tblBookSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "ISBN", "Title", "Author", "Status", "Borrowed By", "Due Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBookSearch.setMaximumSize(new java.awt.Dimension(90, 364));
        tblBookSearch.setMinimumSize(new java.awt.Dimension(105, 364));
        tblBookSearch.setPreferredSize(new java.awt.Dimension(90, 364));
        tblBookSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookSearchMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBookSearch);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 130, 800, 360);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Status");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(420, 50, 80, 20);

        btnSearchStatus.setText("Search Status");
        btnSearchStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStatusActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchStatus);
        btnSearchStatus.setBounds(660, 50, 140, 23);
        jPanel1.add(txtStatusSearch);
        txtStatusSearch.setBounds(510, 50, 140, 20);

        btnSearchTitle.setText("Search Title");
        btnSearchTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTitleActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchTitle);
        btnSearchTitle.setBounds(270, 50, 140, 23);

        jTabbedPane1.addTab("Search Books", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookMouseClicked
        int selectedRow = tblBook.getSelectedRow();
        if (selectedRow >= 0) {
            txtISBN.setText("" + tblBook.getValueAt(selectedRow, 1));
            txtTitle.setText("" + tblBook.getValueAt(selectedRow, 2));            
            txtAuthor.setText("" + tblBook.getValueAt(selectedRow, 3));
        }
}//GEN-LAST:event_tblBookMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        if(txtFile.getText().length()<1){
            JOptionPane.showMessageDialog(this, "No file selected", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        reset();
}//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if(txtFile.getText().length()<1){
            JOptionPane.showMessageDialog(this, "No file selected", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        String errorStr = checkGUI();
        if (errorStr.length() > 0) {
            JOptionPane.showMessageDialog(this, errorStr, "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int selectedRow = tblBook.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "No row selected", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel tblModel = (DefaultTableModel) tblBook.getModel();
        tblModel.removeRow(tblBook.getSelectedRow());

        tblBook.setModel(tblModel);
        writeDBParamsFile();
        this.setCursor(Cursor.getDefaultCursor());
        reset();
        JOptionPane.showMessageDialog(this, "Success");
}//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if(txtFile.getText().length()<1){
            JOptionPane.showMessageDialog(this, "No file selected", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        String errorStr = checkGUI();
        if (errorStr.length() > 0) {
            JOptionPane.showMessageDialog(this, errorStr, "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int selectedRow = tblBook.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "No row selected", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel tblModel = (DefaultTableModel) tblBook.getModel();
        
        Vector rowData = new Vector();
        rowData.add(tblModel.getRowCount());
        rowData.add(txtISBN.getText());
        rowData.add(txtTitle.getText());
        rowData.add(txtAuthor.getText());
        rowData.add(tblModel.getValueAt(tblBook.getSelectedRow(),4));
        rowData.add(tblModel.getValueAt(tblBook.getSelectedRow(),5));
        rowData.add(tblModel.getValueAt(tblBook.getSelectedRow(),6));
        
        tblModel.removeRow(tblBook.getSelectedRow());
        tblModel.addRow(rowData);

        tblBook.setModel(tblModel);
        writeDBParamsFile();
        this.setCursor(Cursor.getDefaultCursor());
        reset();
        JOptionPane.showMessageDialog(this, "Success");
}//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        if(txtFile.getText().length()<1){
            JOptionPane.showMessageDialog(this, "No file selected", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        String errorStr = checkGUI();
        if (errorStr.length() > 0) {
            JOptionPane.showMessageDialog(this, errorStr, "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultTableModel tblModel = (DefaultTableModel) tblBook.getModel();
        Vector rowData = new Vector();
        rowData.add(tblModel.getRowCount());
        rowData.add(txtISBN.getText());
        rowData.add(txtTitle.getText());
        rowData.add(txtAuthor.getText());
        rowData.add("Available");
        rowData.add("");
        rowData.add("");
        
        tblModel.addRow(rowData);

        tblBook.setModel(tblModel);
        writeDBParamsFile();
        this.setCursor(Cursor.getDefaultCursor());
        reset();
        JOptionPane.showMessageDialog(this, "Success");
}//GEN-LAST:event_btnAddActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        JFileChooser jfc = new JFileChooser();
        int ret = jfc.showDialog(null, "Select file");

        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            System.out.println(file);
            txtFile.setText(file.getAbsolutePath());
            populateTable(file.getAbsolutePath());
        }        
}//GEN-LAST:event_btnBrowseActionPerformed

    private void tblBookSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookSearchMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        if(txtFile.getText().length()>0)
            populateTable(txtFile.getText());
        else
            JOptionPane.showMessageDialog(this, "No file selected", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSearchISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchISBNActionPerformed
        if(txtFile.getText().length()<1)
        {    
           JOptionPane.showMessageDialog(this, "No file selected", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
        }
        if(txtISBNSearch.getText().trim().length()<1)
        {    
           JOptionPane.showMessageDialog(this, "ISBN Required", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
        }
        populateTableSearch(txtFile.getText(), txtISBNSearch.getText().trim(),"","","");
    }//GEN-LAST:event_btnSearchISBNActionPerformed

    private void btnSearchTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTitleActionPerformed
        if(txtFile.getText().length()<1)
        {    
           JOptionPane.showMessageDialog(this, "No file selected", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
        }
        if(txtTitleSearch.getText().trim().length()<1)
        {    
           JOptionPane.showMessageDialog(this, "Title Required", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
        }
        populateTableSearch(txtFile.getText(), "",txtTitleSearch.getText().trim(),"","");
    }//GEN-LAST:event_btnSearchTitleActionPerformed

    private void btnSearchAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAuthorActionPerformed
        if(txtFile.getText().length()<1)
        {    
           JOptionPane.showMessageDialog(this, "No file selected", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
        }
        if(txtAuthorSearch.getText().trim().length()<1)
        {    
           JOptionPane.showMessageDialog(this, "Author Required", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
        }
        populateTableSearch(txtFile.getText(), "","",txtAuthorSearch.getText().trim(),"");
    }//GEN-LAST:event_btnSearchAuthorActionPerformed

    private void btnSearchStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStatusActionPerformed
        if(txtFile.getText().length()<1)
        {    
           JOptionPane.showMessageDialog(this, "No file selected", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
        }
        if(txtStatusSearch.getText().trim().length()<1)
        {    
           JOptionPane.showMessageDialog(this, "Status Required", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
        }
        populateTableSearch(txtFile.getText(), "","","",txtStatusSearch.getText().trim());
    }//GEN-LAST:event_btnSearchStatusActionPerformed

    private void btnBorrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowBookActionPerformed
        if(txtFile.getText().length()<1){
            JOptionPane.showMessageDialog(this, "No file selected", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtBorrowerName.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Borrower Name Required", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int selectedRow = tblBook.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "No Book selected", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        DefaultTableModel tblModel = (DefaultTableModel) tblBook.getModel();
        
        if (tblModel.getValueAt(tblBook.getSelectedRow(),4).toString().equalsIgnoreCase("Borrowed")) {
            JOptionPane.showMessageDialog(this, "Book already borrowed", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Vector rowData = new Vector();
        rowData.add(tblModel.getRowCount());
        rowData.add(txtISBN.getText());
        rowData.add(txtTitle.getText());
        rowData.add(txtAuthor.getText());
        rowData.add("Borrowed");
        rowData.add(txtBorrowerName.getText().trim());
        String returnDate = getReturnDate();
        rowData.add(returnDate);
        
        tblModel.removeRow(tblBook.getSelectedRow());
        tblModel.addRow(rowData);

        tblBook.setModel(tblModel);
        writeDBParamsFile();
        this.setCursor(Cursor.getDefaultCursor());
        reset();
        JOptionPane.showMessageDialog(this, "Success. You have to return on " + returnDate);
    }//GEN-LAST:event_btnBorrowBookActionPerformed

    private void btnReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBookActionPerformed
        if(txtFile.getText().length()<1){
            JOptionPane.showMessageDialog(this, "No file selected", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int selectedRow = tblBook.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "No Book selected", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        DefaultTableModel tblModel = (DefaultTableModel) tblBook.getModel();
        
        if (tblModel.getValueAt(tblBook.getSelectedRow(),4).toString().equalsIgnoreCase("Available")) {
            JOptionPane.showMessageDialog(this, "Book not borrowed", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Vector rowData = new Vector();
        rowData.add(tblModel.getRowCount());
        rowData.add(txtISBN.getText());
        rowData.add(txtTitle.getText());
        rowData.add(txtAuthor.getText());
        rowData.add("Available");
        rowData.add("");
        rowData.add("");
        
        tblModel.removeRow(tblBook.getSelectedRow());
        tblModel.addRow(rowData);

        tblBook.setModel(tblModel);
        writeDBParamsFile();
        this.setCursor(Cursor.getDefaultCursor());
        reset();
        JOptionPane.showMessageDialog(this, "Success. You have returned the book");
    }//GEN-LAST:event_btnReturnBookActionPerformed

    private void btnSearchOverdueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchOverdueActionPerformed
        if(txtFile.getText().length()<1)
        {    
           JOptionPane.showMessageDialog(this, "No file selected", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
        }

        populateTableSearchOverdue(txtFile.getText());
    }//GEN-LAST:event_btnSearchOverdueActionPerformed

    private String getReturnDate(){        
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, 5); // Adding 5 days
        String output = sdf.format(c.getTime());
        return output;
    }
    
    private void reset() {
        txtISBN.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    private void populateTable(String fileName) {
        String fileContents = readDBParamsFile(fileName);
        String[] fileArr = fileContents.split("\\n");
        String[] row;

        DefaultTableModel tblModel = (DefaultTableModel) tblBook.getModel();
        tblModel.setRowCount(0);
        Vector rowData;
        for (int i = 0; i < fileArr.length; i++) {
            row = fileArr[i].split("\\|");
            rowData = new Vector();
            rowData.add(i + 1);
            for (int j = 0; j < row.length; j++) {
                System.out.println("Adding:" + row[j]);
                rowData.add(row[j]);
            }

            tblModel.addRow(rowData);
        }
        if (tblModel.getRowCount() > 0) {
            System.out.println("Rows: " + tblModel.getRowCount());
            tblBook.setModel(tblModel);
            System.out.println("Rows: " + tblBook.getRowCount());
            this.repaint();
        }
    }
    
    private void populateTableSearch(String fileName, String isbn, String title, String author, String status) {
        String fileContents = readDBParamsFile(fileName);
        String[] fileArr = fileContents.split("\\n");
        String[] row;

        DefaultTableModel tblModel = (DefaultTableModel) tblBookSearch.getModel();
        tblModel.setRowCount(0);
        Vector rowData;
        for (int i = 0; i < fileArr.length; i++) {
            row = fileArr[i].split("\\|");
            if(row[0].equalsIgnoreCase(isbn) || row[1].equalsIgnoreCase(title) ||
               row[2].equalsIgnoreCase(author)|| row[3].equalsIgnoreCase(status)){
            rowData = new Vector();
            rowData.add(i + 1);
            for (int j = 0; j < row.length; j++) {
                System.out.println("Adding:" + row[j]);
                rowData.add(row[j]);
            }
            tblModel.addRow(rowData);
            }
        }
        if (tblModel.getRowCount() > 0) {
            System.out.println("Rows: " + tblModel.getRowCount());
            tblBookSearch.setModel(tblModel);
            System.out.println("Rows: " + tblBookSearch.getRowCount());
            this.repaint();
        }
    }

    private void populateTableSearchOverdue(String fileName) {
       try {
        String fileContents = readDBParamsFile(fileName);
        String[] fileArr = fileContents.split("\\n");
        String[] row;

        DefaultTableModel tblModel = (DefaultTableModel) tblBookSearch.getModel();
        tblModel.setRowCount(0);
        Vector rowData;
        for (int i = 0; i < fileArr.length; i++) {
            row = fileArr[i].split("\\|");
            if(row[3].equalsIgnoreCase("Borrowed")){
                if(new Date().after(sdf.parse(row[5].toString()))){
                    rowData = new Vector();
                    rowData.add(i + 1);
                    for (int j = 0; j < row.length; j++) {
                        System.out.println("Adding:" + row[j]);
                        rowData.add(row[j]);
                    }
                    tblModel.addRow(rowData);
                }
            }
        }
        if (tblModel.getRowCount() > 0) {
            System.out.println("Rows: " + tblModel.getRowCount());
            tblBookSearch.setModel(tblModel);
            System.out.println("Rows: " + tblBookSearch.getRowCount());
            this.repaint();
        }
       } catch(Exception ex){
           
       }
    }
    
    private String readDBParamsFile(String fileName) {
        String fileContents = FileManager.readFile(fileName);
        return fileContents;
    }

    private void writeDBParamsFile() {
        DefaultTableModel tblModel = (DefaultTableModel) tblBook.getModel();
        String fileStr = "";

        for (int i = 0; i < tblModel.getRowCount(); i++) {

            fileStr += tblModel.getValueAt(i, 1) + "|";
            fileStr += tblModel.getValueAt(i, 2) + "|";
            fileStr += tblModel.getValueAt(i, 3) + "|";
            fileStr += tblModel.getValueAt(i, 4) + "|";
            fileStr += tblModel.getValueAt(i, 5) + "|";
            fileStr += tblModel.getValueAt(i, 6) + "\n";            
        }

        FileManager.writeToFile(txtFile.getText(), fileStr, false);
    }

    private String checkGUI() {
        String errorStr = "";
        if (txtISBN.getText().length() < 1) {
            errorStr += "ISBN must be added" + "\n";
        }
        if (txtTitle.getText().length() < 1) {
            errorStr += "Title must be added" + "\n";
        }
        if (txtAuthor.getText().length() < 1) {
            errorStr += "Author must be added" + "\n";
        }
        return errorStr;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBorrowBook;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReturnBook;
    private javax.swing.JButton btnSearchAuthor;
    private javax.swing.JButton btnSearchISBN;
    private javax.swing.JButton btnSearchOverdue;
    private javax.swing.JButton btnSearchStatus;
    private javax.swing.JButton btnSearchTitle;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTable tblBook;
    private javax.swing.JTable tblBookSearch;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtAuthorSearch;
    private javax.swing.JTextField txtBorrowerName;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtISBNSearch;
    private javax.swing.JTextField txtMaxBooks;
    private javax.swing.JTextField txtStatusSearch;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtTitleSearch;
    // End of variables declaration//GEN-END:variables
}
