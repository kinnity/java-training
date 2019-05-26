package by.epam.training.unit13ht.task03.dao;

import by.epam.training.unit13ht.task03.dao.impl.FileLibraryCreatorDAO;

public class DAOProvider {

    private final static DAOProvider instance = new DAOProvider();
    private final LibraryCreatorDAO creatorDAO = new FileLibraryCreatorDAO();

    private DAOProvider() {
    }

    public static DAOProvider getInstance() {
        return instance;
    }

    public LibraryCreatorDAO getLibraryCreatorDAO() {
        return creatorDAO;
    }
}
