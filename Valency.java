import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Valency extends JFrame implements ActionListener
{
    JTextField t1=new JTextField(8);
    JLabel l1=new JLabel("Enter Atomic Number");
    JTextField e1=new JTextField(5);
    JTextField e2=new JTextField(8);
    JTextField e3=new JTextField(12);
    JTextField e4=new JTextField(18);
    JTextField e5=new JTextField(18);
    JTextField e6=new JTextField(12);
    JTextField e7=new JTextField(8);
    JTextField e8=new JTextField(5);
    JButton b2=new JButton("           ENTER          ");
    JLabel l2=new JLabel("                                                                Valency                                                                                            ");
    JLabel l5=new JLabel("ELEMENT NAME ");
    JTextField t2=new JTextField(35);
    JLabel l3=new JLabel("  Author   :   ADITYA PANDEY");
    public Valency()
    {
        setLayout(new FlowLayout());
        setSize(560,180);
        setVisible(true);
        setResizable(false);
        setTitle("  VALENCY ");
        add(l1);
        add(t1);
        add(b2);
        b2.addActionListener(this);
        add(l2); 
        add(l5);
        t2.setEditable(false);
        add(t2);
        e1.setEditable(false);
        add(e1);
        e2.setEditable(false);
        add(e2);
        e3.setEditable(false);
        add(e3);
        e4.setEditable(false);
        add(e4);
        e5.setEditable(false);
        add(e5);
        e6.setEditable(false);
        add(e6);
        e7.setEditable(false);
        add(e7);
        e8.setEditable(false);
        add(e8);
        add(l3);
    }

    public void actionPerformed(ActionEvent l)
    {
        try
        { 
            int a=Integer.parseInt(t1.getText());
            String ar[]={"1s","2s","2p","3s","3p","4s","3d","4p","5s","4d","5p","6s","4f","5d","6p","7s","5f","6d","7p","8s"};
            int s=0,p=0,d=0,f=0;
            int x12=a;
            int v[]=new int[21];
            int i=0;
            String k1="",k2="",k3="",k4="",k5="",k6="",k7="",k8="";
            if(a!=0&&a<=120)
            {
                String name[]={"","HYDROGEN","HELIUM","LITHIUM","BERYLIUM","BORON","CARBON","NITROGEN",
                    "OXYGEN","FLUROINE","NEON","SODIUM","MAGNESIUM","ALUMINIUM","SILICON","PHOSPHORUS",
                    "SULPHUR","CHLORINE","ARGON","POTASSIUM","CALCIUM","SCANDIUM","TITANIUM","VANADIUM",
                    "CHROMIUM","MANGANESE","IRON","COBOLT","NICKLE","COPPER","ZINC","GALLIUM","GERMANIUM",
                    "ARSENIC","SELENIUM","BROMINE","KRYPTON","RUBIDIUM","STRONTIUM","YITRIUM","ZIRCONIUM",
                    "NLOBIUM","MOLYBDENUM","TECHNITIUM","RUTHENIUM","RHODIUM","PALLADIUM","SILVER","CADMIUM",
                    "INDIUM","TIN","ANTIMONY","TELLURIUM","IODINE","XENON","CESIUM","BARIUM","LANTHANUM",
                    "CERIUM","PRASEODYMIUM","NEODYMIUM","PROMETHIUM","SAMARIUM","EUROPIUM","GADOLINIUM",
                    "TERBIUM","DYSPROSIUM","HOLMIUM","ERBIUM","THULIUM","YTTERBIUM","LUTETIUM","HAFNIUM",
                    "TANTALUM","TUNGSTEN","RHENIUM","OSMIUM","IRIDIUM","PLATINUM","GOLD","MERCURY","THALLIUM",
                    "LEAD","BISMUTH","POLONIUM","ASTATINE","RADON","FRANCIUM","RADIUM","ACTINIUM",
                    "THORIUM","PROTACTINLUM","URANIUM","NEPTIUM","PLUTONIUM","AMERICIUM","CURIUM",
                    "BERKELIUM","CALIFORNIUM","EINSTEINIUM","FERMIUM","MENDELEVIUM","NOBELIUM","LAWRENCIUM",
                    "RUTHERFORDIUM","DUBNIUM","SEABORGIUM","BOHRIUM","HASSIUM","MEITNERIUM","DARMSTADTIUM",
                    "ROENTGENIUM","COPERNICIUM","UNUNTRIUM","FLEROVIUM","UNUNPENTIUM","LIVERMORIUM","UNUNSEPTIUM",
                    "UNUNOCTIUM","","",};
                    for(int x=0;x<=a-1;x++)
                    {
                    if(i==0||i==1||i==3||i==5||i==8||i==11||i==15||i==19)
                    {
                        if(s<2)
                        {
                            s++;
                            if(s==2||x==a-1)
                            {
                                v[i]=s;
                                s=0;
                                i++;
                            }
                        }
                    }
                    else if(i==2||i==4||i==7||i==10||i==14||i==18)
                    {
                        if(p<6)
                        {
                            p++;
                            if(p==6||x==a-1)
                            {
                                v[i]=p;
                                p=0;
                                i++;
                            }
                        }
                    }
                    else if(i==6||i==9||i==13||i==17)
                    {
                        if(d<10)
                        {
                            d++;
                            if(d==9&&a-x==1||d==4&&a-x==1)
                            {
                                d++;
                                v[i-1]-=1;
                            }
                            if(d==10||x==a-1)
                            {
                                v[i]=d;
                                d=0;
                                i++;
                            }
                        }
                    }
                    else if(i==12||i==16)
                    {
                        if(f<14)
                        {
                            f++;
                            if(f==14||x==a-1)
                            {
                                v[i]=f;
                                f=0;
                                i++;
                            }
                        }
                    }
                }
                String s3[]=new String[i];
                for(int x=0;x<=i;x++)
                {
                    if(v[x]!=0)
                    {
                        s3[x]=ar[x]+v[x];
                    }
                }
                for(int x=0;x<=s3.length-1;x++)
                {
                    char ch=s3[x].charAt(0);
                    if(ch==49)
                    {
                        k1=k1+s3[x];
                    }
                    else if(ch==50)
                    {
                        k2=k2+s3[x]+"     ";
                    }
                    else if(ch==51)
                    {
                        k3=k3+s3[x]+"     ";
                    }
                    else if(ch==52)
                    {
                        k4=k4+s3[x]+"     ";
                    }
                    else if(ch==53)
                    {
                        k5=k5+s3[x]+"     ";
                    }
                    else if(ch==54)
                    {
                        k6=k6+s3[x]+"     ";
                    }
                    else if(ch==55)
                    {
                        k7=k7+s3[x]+"     ";
                    }
                    else if(ch==56)
                    {
                        k8=k8+s3[x];
                    }
                }
                t2.setText(name[x12]);
                e1.setText(k1);
                e2.setText(k2);
                e3.setText(k3);
                e4.setText(k4);
                e5.setText(k5);
                e6.setText(k6);
                e7.setText(k7);
                e8.setText(k8);
            }
            else
            {
                t2.setText("");
                e3.setText("NO Valency");
                e1.setText(k1);
                e2.setText(k2);
                e4.setText(k4);
                e5.setText(k5);
                e6.setText(k6);
                e7.setText(k7);
                e8.setText(k8);
            }
        }
        catch(Exception y)
        {
            e1.setText("ERROR");
            e2.setText("");
            e3.setText("");
            e3.setText("");
            e4.setText("");
            e5.setText("");
            e6.setText("");
            e7.setText("");
            e8.setText("");
        }
    }

    public static void main(String args[])
    {
        Valecy ob=new Valency();
    }
}
