package ${package}.entity;

import org.devocative.demeter.entity.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "t_${ModuleShortName.toLowerCase()}_book")
public class Book implements ICreationDate, ICreatorUser, IModificationDate, IModifierUser {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "${ModuleShortName.toLowerCase()}_book")
	@org.hibernate.annotations.GenericGenerator(name = "${ModuleShortName.toLowerCase()}_book", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
		parameters = {
			//@org.hibernate.annotations.Parameter(name = "optimizer", value = "pooled"),
			@org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
			@org.hibernate.annotations.Parameter(name = "increment_size", value = "1"),
			@org.hibernate.annotations.Parameter(name = "sequence_name", value = "${ModuleShortName.toLowerCase()}_book")
		})
	private Long id;

	@Column(name = "c_name", nullable = false)
	private String name;

	// --------------- CREATE / MODIFY

	@Column(name = "d_creation", nullable = false, columnDefinition = "date")
	private Date creationDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "f_creator_user", nullable = false, insertable = false, updatable = false,
		foreignKey = @ForeignKey(name = "book_crtrusr2user"))
	private User creatorUser;

	@Column(name = "f_creator_user", nullable = false)
	private Long creatorUserId;

	@Column(name = "d_modification", columnDefinition = "date")
	private Date modificationDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "f_modifier_user", insertable = false, updatable = false,
		foreignKey = @ForeignKey(name = "book_mdfrusr2user"))
	private User modifierUser;

	@Column(name = "f_modifier_user")
	private Long modifierUserId;

	@Version
	@Column(name = "n_version", nullable = false)
	private Integer version = 0;

	// ------------------------------

	public Book() {
	}

	// ------------------------------

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public User getCreatorUser() {
		return creatorUser;
	}

	public void setCreatorUser(User creatorUser) {
		this.creatorUser = creatorUser;
	}

	public Long getCreatorUserId() {
		return creatorUserId;
	}

	public void setCreatorUserId(Long creatorUserId) {
		this.creatorUserId = creatorUserId;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public User getModifierUser() {
		return modifierUser;
	}

	public void setModifierUser(User modifierUser) {
		this.modifierUser = modifierUser;
	}

	public Long getModifierUserId() {
		return modifierUserId;
	}

	public void setModifierUserId(Long modifierUserId) {
		this.modifierUserId = modifierUserId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	// --------------

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Book)) return false;

		Book book = (Book) o;

		if (getId() != null ? !getId().equals(book.getId()) : book.getId() != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return getId() != null ? getId().hashCode() : 0;
	}

	@Override
	public String toString() {
		return getName();
	}
}