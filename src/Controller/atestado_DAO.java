
package Controller;

import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;

public class atestado_DAO {
    
    public static void Impressão ()throws Exception {
 
        Document doc = null;
        OutputStream os = null;
 
   
  try {
 
            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
 
            //cria a stream de saída
            os = new FileOutputStream("Atestado.pdf");
 
            //associa a stream de saída ao
            PdfWriter.getInstance(doc, os);
 
            //abre o documento
            doc.open();
           
 
            //adiciona o texto ao PDF
            Paragraph p1= new Paragraph ("ATESTADO MEDICO");
            Paragraph par1 = new Paragraph("" );
             p1.setAlignment(Element.ALIGN_CENTER);  
            Paragraph par2 = new Paragraph("Atesto para " + "" );      
            Paragraph par3 = new Paragraph("que o SRº " + "");
            Paragraph par4 = new Paragraph("Portador da identidade nº " + " " + "esteve sob"); 
            Paragraph par5 = new Paragraph(" cuidados médicos no dia " + " "+ "e deverá se afastar");
            Paragraph par6 = new Paragraph(" de suas atividades pelo período de " + " " + "até" + " " );
            Paragraph par7 = new Paragraph("por motivos de" + " ");
            
            
           doc.add(p1);
           doc.add(par1);
           doc.add(par2); 
           doc.add(par3); 
           doc.add(par4);
           doc.add(par5);
           doc.add(par6);
           doc.add(par7);
           
        } finally {
 
            if (doc != null) {
 
                //fechamento do documento
                doc.close();
            }
 
            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }
        Desktop.getDesktop().open(new File("Atestado.pdf"));
    }
}
