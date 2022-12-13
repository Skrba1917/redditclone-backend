package skrbic.reddit.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import skrbic.reddit.backend.model.Comment;
import skrbic.reddit.backend.model.Post;
import skrbic.reddit.backend.model.User;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
