/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.utp.dwi.dao.impl.ProductoDaoImpl;
import com.utp.dwi.dto.ProductoDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author JMR CODE
 */
public class Test {
    public static void main(String[] args) throws SQLException {
            
            List<ProductoDTO> lista =new ArrayList<>();
            ProductoDaoImpl dao = new ProductoDaoImpl();
                       
            lista= dao.listarProducto("");
            
            for (ProductoDTO p : lista ) {
                System.out.println(p.toString());
            
        }
    }
    
}
