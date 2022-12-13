package skrbic.reddit.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import skrbic.reddit.backend.model.Post;
import skrbic.reddit.backend.model.Subreddit;
import skrbic.reddit.backend.model.User;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
