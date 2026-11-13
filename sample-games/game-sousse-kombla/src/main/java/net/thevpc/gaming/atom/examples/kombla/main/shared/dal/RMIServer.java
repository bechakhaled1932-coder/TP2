package net.thevpc.gaming.atom.examples.kombla.main.shared.dal;

import net.thevpc.gaming.atom.examples.kombla.main.shared.model.StartGameInfo;

import java.rmi.RemoteException;

public interface RMIServer {
    StartGameInfo join(String playerName, RMIClient callback)
            throws RemoteException;

    void moveLeft(int playerId)    throws RemoteException;
    void moveRight(int playerId)   throws RemoteException;
    void moveUp(int playerId)      throws RemoteException;
    void moveDown(int playerId)    throws RemoteException;
    void releaseBomb(int playerId) throws RemoteException;

}
