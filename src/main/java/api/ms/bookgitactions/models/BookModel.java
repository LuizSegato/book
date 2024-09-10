package api.ms.bookgitactions.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity(name = "TB_BOOKS")
@Table(name = "TB_BOOKS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID bookId;
    @Column(nullable = false, unique = true, length = 20)
    private String bookCode;
    @Column(length = 200)
    private String bookDescription;
    @Column(nullable = false, length = 100)
    private String bookName;
}
