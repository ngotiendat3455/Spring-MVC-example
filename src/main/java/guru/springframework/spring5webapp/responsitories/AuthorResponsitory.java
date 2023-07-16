package guru.springframework.spring5webapp.responsitories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorResponsitory extends CrudRepository<Author, Long> {
}
