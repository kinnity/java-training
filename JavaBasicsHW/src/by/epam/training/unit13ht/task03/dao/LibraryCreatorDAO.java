package by.epam.training.unit13ht.task03.dao;

import by.epam.training.unit13ht.task03.entity.Library;
import by.epam.training.unit13ht.task03.exception.DAOException;

public interface LibraryCreatorDAO {
    Library create() throws DAOException;

    void save(Library library) throws DAOException;
}
