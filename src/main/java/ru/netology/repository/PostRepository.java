package ru.netology.repository;

import ru.netology.model.Post;

import java.util.*;

public class PostRepository {
    private long id = 0;
    private Map<Long, Post> postMap = new HashMap<>();

    public List<Post> all() {
        return Collections.emptyList();
    }

    public Optional<Post> getById(long id) {
        return Optional.empty();
    }

    public synchronized Post save(Post post) {
        if (id == 0) {
            id++;
            postMap.put(id, post);
        }
        return post;
    }

    public synchronized void removeById(long id, Post post) {
        if (id != 0) {
            postMap.replace(id, post);
        }
    }
}
