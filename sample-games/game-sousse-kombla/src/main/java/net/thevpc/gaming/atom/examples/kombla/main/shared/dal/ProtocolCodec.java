package net.thevpc.gaming.atom.examples.kombla.main.shared.dal;
import java.io.*;
import java.io.DataInputStream ;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import net.thevpc.gaming.atom.examples.kombla.main.shared.model.DynamicGameModel;
import net.thevpc.gaming.atom.examples.kombla.main.shared.model.StartGameInfo;
import net.thevpc.gaming.atom.model.Player;
import net.thevpc.gaming.atom.model.Sprite;


public class ProtocolCodec{

    //StartGameInfo

    public static void writeStartGameInfo(OutputStream x , StartGameInfo Info){
        throws IOException{
        }

    }

    public static StartGameInfo readStartGameInfo(InputStream x){
        throws IOException
    }

    //Player

    public static void writePlayer(OutputStream x , Player player){
        throws IOException{

        }
    }

    public static Player readPlayer(InputStream x){
        throws IOException{

        }
    }

    //Sprite

    public static void writeSprite(OutputStream x , Sprite sprite){

        throws IOException{

        }
    }

    public static Sprite readSprite(InputStream x){

        throws IOException{

        }
    }

    //DynamicGameModel

    public static void writeDynamicGameModel(OutputStream x, DynamicGameModel model){

        throws IOException{

        }
    }

    public static DynamicGameModel readDynamicGameModel(InputStream x){

        throws IOException{

        }
    }

}