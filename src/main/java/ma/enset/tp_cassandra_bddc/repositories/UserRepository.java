package ma.enset.tp_cassandra_bddc.repositories;

import ma.enset.tp_cassandra_bddc.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface UserRepository extends CassandraRepository<User, UUID> {

}
