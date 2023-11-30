/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica4;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author felix
 */
public class Practica4 {

    public static void main(String[] args) throws Exception  {
        
        ListaDeCartas a = new ListaDeCartas ();
        a.setAtributoFiltro("Oscuridad");
        a.setLvFiltro("5");
        Lista<Carta> b = a.ordenarListaPorAtributo();
        if(b == null)
        {
            System.out.println("NULLLLLLL");
        }
        else
        {
            System.out.println(b.mostrarLista());
        }
        
        /*
        String a = "C:\\Users\\felix\\Downloads\\La taberna de baba yaga.wav";
        //File yourFile = new File("C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica4\\src\\main\\java\\com\\mycompany\\practica4\\La taberna de baba yaga.wav");
         try
    {
        File musicPath = new File(a);
        if (musicPath.exists())

        {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            Scanner sc = new Scanner(System.in);
            int op = 1;
            while (op != 0)
            {
                System.out.println("Scanear: ");
                op = sc.nextInt();
            }
            clip.close();
        }}
    catch (Exception exc)
    {
        exc.printStackTrace(System.out);
    }
        /*
        ListaDeCartas a = new ListaDeCartas();
        
        Lista<Carta> b = a.getCartas();
        String c = b.buscarPosición(0).getDato().getCaminoImagen();
        BufferedImage bufferedImage = ImageIO.read(new File(c));
        Image image = bufferedImage.getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(image);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(1200, 800);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(icon);
        frame.add(jLabel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
        //a.mostrarLista();
        /*
        JPanel imagenCarta = new JPanel();
        JFrame frame = new JFrame();
        frame.setBounds(50, 50, 200, 350);
        imagenCarta.setBounds(75, 75, 150, 150);
        File csv = new File ("C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica4\\src\\main\\java\\com\\mycompany\\practica4\\listaCartas.csv");
        /*
        Scanner sc = null;
        try{
            sc = new Scanner(new File("C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica4\\src\\main\\java\\com\\mycompany\\practica4\\listaCartas.csv"));  
            sc.useDelimiter(",");
            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        
        
        FileReader file = null;
        try {
            file = new FileReader(csv);
            }catch (FileNotFoundException ex) {
            Logger.getLogger(Practica4.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        BufferedReader buffer = new BufferedReader(file);
        /*
        try (Scanner sc = new Scanner(csv)) {
            sc.useDelimiter(",");
            while (sc.hasNext()) {
                System.out.print(sc.next());  //find and returns the next complete token from this scanner  
            }
        
        //buffer.readLine();
            String b = buffer.readLine(); 
            //System.out.println(b);
            String[] c;
                    /*= b.split(",");
             System.out.println(c.length);
             String[] c
           for (String i: c)
           {
               System.out.println(i);
           }
            
        //Carta,Atributo,Tipo,Nivel,ATK,DEF
        ArrayList<Carta> l = new ArrayList();
        Lista<Carta> cartas = new Lista();
        Carta aux;
        int tamaño;
        String [] tipos;
        int contador = 0;
        ImageIcon iconoAux;
        String caminoAux = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica4\\src\\main\\java\\com\\mycompany\\practica4\\Imagenes de cartas\\";
        while(b != null)
        {
            c = b.split(",");
            tamaño = c.length;
            if (c.length > 3)
            {
                tipos = new String[tamaño-5];
                for (int i = 2; i < tamaño-3; i++)
                {
                    tipos[i-2] = c[i];
                }
                aux = new Carta(c[0], c[1],tipos, Integer.parseInt(c[tamaño-3]), Integer.parseInt(c[tamaño-2]), Integer.parseInt(c[tamaño-1]));
                cartas.insertarInicio( new Carta(c[0], c[1],tipos, Integer.parseInt(c[tamaño-3]), Integer.parseInt(c[tamaño-2]), Integer.parseInt(c[tamaño-1])));
            }
            else
            {
                tipos = new String[tamaño-2];
                for (int i = 2; i < tamaño; i++)
                {
                    tipos[i-2] = c[i];
                }
                aux = new Carta(c[0], c[1], tipos);
                cartas.insertarInicio(new Carta(c[0], c[1], tipos));
            }
            /*
            if (contador < 6)
            {
                iconoAux = new ImageIcon(caminoAux + c[0] + ".png");
                aux.setIcono(iconoAux);
                JLabel a = new JLabel(aux.getIcono());
                a.setBounds(75,75, 150, 150);
                imagenCarta.add(a);
                frame.add(imagenCarta);
               
                frame.setVisible(true);
            }
            else
            {
                frame.setVisible(false);
            }
            contador += 1;
            
           l.add(aux);
            b = buffer.readLine();
        }
        /*for (Carta i:l)
        {
            System.out.println(i.toString());
        }
        
        Comparator porNivelLtoH = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               Carta c1 = (Carta) o1;
               Carta c2 = (Carta) o2;
               return (c1.getLv() - c2.getLv());
            }
        };
        Comparator porNivelHtoL = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               Carta c1 = (Carta) o1;
               Carta c2 = (Carta) o2;
               return (c2.getLv() - c1.getLv());
            }
        };
        Comparator porAtributo = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               Carta c1 = (Carta) o1;
               Carta c2 = (Carta) o2;
               return (c1.getAtributo().compareTo(c2.getAtributo()));
            }
        };
        Comparator porAtributoReverse = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               Carta c1 = (Carta) o1;
               Carta c2 = (Carta) o2;
               return (c2.getAtributo().compareTo(c1.getAtributo()));
            }
        };
        Comparator porAtkLtoH = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               Carta c1 = (Carta) o1;
               Carta c2 = (Carta) o2;
               return (c1.getAtk()-c2.getAtk());
            }
        };
        Comparator porAtkHtoL = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               Carta c1 = (Carta) o1;
               Carta c2 = (Carta) o2;
               return (c2.getAtk()-c1.getAtk());
            }
        };
        Comparator porDefHtoL = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               Carta c1 = (Carta) o1;
               Carta c2 = (Carta) o2;
               return (c2.getDef()-c1.getDef());
            }
        };
        Comparator porDefLtoH = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               Carta c1 = (Carta) o1;
               Carta c2 = (Carta) o2;
               return (c1.getDef()-c2.getDef());
            }
        };
        
        cartas.ordenarLista(porDefLtoH);
        System.out.println(cartas.mostrarLista());
        //*/
    }
}
