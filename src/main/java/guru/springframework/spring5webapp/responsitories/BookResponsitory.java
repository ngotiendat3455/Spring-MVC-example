package guru.springframework.spring5webapp.responsitories;
import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookResponsitory extends CrudRepository<Book, Long> {
}
