package org.springframework.data.elasticsearch.repositories.custom;

import java.util.stream.Stream;

import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.entities.SampleEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author Rasmus Faber-Espensen
 */
public interface SampleStreamingCustomMethodRepository extends ElasticsearchRepository<SampleEntity, String> {
	Stream<SampleEntity> findByType(String type);

	Stream<SampleEntity> findByType(String type, Pageable pageable);
}
