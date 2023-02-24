/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.asti.examenpsicometrico.Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GAMR_
 */
public class DaoAlumno implements DaoGeneral<Alumno> {

    private ConexionDB con = ConexionDB.getVentana();
    private Connection conn = con.getConexion();
    ResultSet rs = null;
    
    public DaoAlumno(){
    
    }
    
    @Override
    public boolean add(Alumno pojo) {
        //Por resolver: Rs no for SQL
        String consulta = "INSERT INTO ALUMNO(NOMBRE, APELLIDOS, FOLIO, PUESTO, FECHA, CALIFICACION) VALUES(?,?,?,?,?,?)";
        ResultSet rs = null;
        ResultSetMetaData rsm = null;
        try {
            System.out.println("inicio");
            PreparedStatement sentencia = conn.prepareStatement(consulta);
            System.out.println("sentencia");
            sentencia.setString(1, pojo.getNombre());
            sentencia.setString(2, pojo.getApellidos());
            sentencia.setString(3, pojo.getFolio());
            sentencia.setString(4, pojo.getPuesto());
            sentencia.setString(5, pojo.getFecha());
            sentencia.setString(6, String.valueOf(pojo.getCalificacion()));
            System.out.println("parametros");
            sentencia.execute();
            //rs = sentencia.executeQuery();

        } catch (SQLException ex) {
            System.out.println("No se pudo guardar");
            Logger.getLogger(DaoAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

    @Override
    public boolean delete(Alumno pojo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Alumno pojo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Alumno read(int Cod_emp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Alumno> readAll() {
        List<Alumno> listAlumno = new ArrayList<>();
        String consulta = "SELECT * FROM alumno";
        ResultSet rs = null;
        ResultSetMetaData rsm = null;
        try {
            System.out.println("inicio");
            PreparedStatement sentencia = conn.prepareStatement(consulta);
            rs = sentencia.executeQuery();
            rsm = rs.getMetaData();
            
            int colCount = rsm.getColumnCount();
            int rowCount = 0;
            while (rs.next()) {
                Alumno alumno = new Alumno();;
                String[] data = new String[7];
                rowCount++;
                System.out.println("Datos para la fila " + rowCount);
                alumno.setNombre(rs.getString(1));
                alumno.setApellidos(rs.getString(2));
                alumno.setFolio(rs.getString(3));
                alumno.setPuesto(rs.getString(4));
                alumno.setFecha(rs.getString(5));
                alumno.setCalificacion(Double.parseDouble(rs.getString(6)));
                listAlumno.add(alumno);
                
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo guardar");
            Logger.getLogger(DaoAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listAlumno;
    }
    
}
