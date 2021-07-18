package ru.netology.repository;

import ru.netology.model.Post;

import java.util.*;

public class PostRepository {
    private int id = 1;
    private Map<Integer, Post> postMap = new HashMap<>();

    public List<Post> all() {
        return Collections.emptyList();
    }

    public Optional<Post> getById(long id) {
        return Optional.empty();
    }

    public synchronized Post save(Post post) {
        id++;
        postMap.put(id, post);
        return post;
    }

    public void removeById(long id) {
    }
}
