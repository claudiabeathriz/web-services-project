package com.educandoweb.course.config;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.enums.OrderStatus;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
// não polui banco real
public class TestConfig implements CommandLineRunner {
    // interface que possui o metodo run
    // >popular o banco H2 automaticamente<
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        // dentro do metodo é executado
        // depois que a aplicação sobe
        // depois que o contexto Spring é carregado
        // antes da aplicação começar a receber requisições
        User u1 = new User(null, "Maria da Silva", "mariadasilva@email.com", "9888-8888", "Msenha");
        User u2 = new User(null, "Pedro da Silva", "pedrodasilva@email.com", "9777-7777", "Psenha");

        // ISO 8601
        Order o1 = new Order(null, Instant.parse("2026-02-26T18:36:59Z"), u1, OrderStatus.WAITING_PAYMENT);
        Order o2 = new Order(null, Instant.parse("2026-02-26T18:38:59Z"), u1, OrderStatus.WAITING_PAYMENT);
        Order o3 = new Order(null, Instant.parse("2026-02-26T18:40:59Z"), u1, OrderStatus.CANCELLED);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
