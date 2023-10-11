package br.edu.atitus.atitusound.entities;

import java.time.Duration;
import java.util.UUID;

public class MusicEntity {
	
	private UUID uuid;
	private String name;
	private Duration duration;
	private ArtistEntity artist;
	private int like_count;
	private String url;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public UUID getUuid() {
		return uuid;
	}
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArtistEntity getArtist() {
		return artist;
	}
	public void setArtist(ArtistEntity artist) {
		this.artist = artist;
	}
	public int getLike_count() {
		return like_count;
	}
	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}

	
}
