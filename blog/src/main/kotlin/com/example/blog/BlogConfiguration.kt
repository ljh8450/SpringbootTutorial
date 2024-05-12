package com.example.blog

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseIInitializer(userRepository: UserRepository, articleRepository: ArticleRepository) = ApplicationRunner {

        val johnDoe = userRepository.save(User("johnDoe", "John", "Doe"))
        articleRepository.save(Article(
            title = "Lorem",
            headline = "Lorem",
            content = "dolor sit amet",
            author = johnDoe
        ))
        articleRepository.save(Article(
            title = "lpsum",
            headline = "lpsum",
            content = "dolor sit amet",
            author = johnDoe
        ))
    }
}