package guru.springframework.spring5webapp.responsitories;

import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherResponsitory extends CrudRepository<Publisher, Long> {
}
