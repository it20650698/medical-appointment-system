package lk.medical.repository;
import java.io.IOException; import java.util.List; import java.util.Optional;
public interface FileRepository<T> { List<T> findAll() throws IOException; Optional<T> findById(String id) throws IOException; void save(T entity) throws IOException; void deleteById(String id) throws IOException; }
