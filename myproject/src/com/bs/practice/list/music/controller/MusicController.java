package com.bs.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.bs.practice.list.music.model.vo.Music;

public class MusicController {
	ArrayList<Music> musicList = new ArrayList<Music>();
	
	public MusicController() {
	}
	public int addList(Music music) {
		musicList.add(musicList.size(), music);
		return 1;
	}
	public int addAtZero(Music music) {
//		for(int i=0; i<musicList.size();i++) {
//			musicList.lastIndexOf()
//		}
		musicList.add(0, music);
		return 1;
	}
	
	public List printAll() {
		return musicList;
	}

	public Music searchMusic(String title) {
		Music searchList = new Music();
		for(int i=0;i<musicList.size();i++) {
			if(musicList.get(i).getTitle().contains(title)) {
				searchList = new Music(musicList.get(i).getTitle(),musicList.get(i).getSinger());
				return searchList;
			}
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		Music removeMusic = null;
		for(int i=0;i<musicList.size();i++) {
			if(musicList.get(i).getTitle().equals(title)) {
				removeMusic = new Music(musicList.get(i).getTitle(),musicList.get(i).getSinger());
				musicList.remove(i);
				return removeMusic;
			}	
		}
		return removeMusic;
	}
	public Music setMusic(String title, Music music) {
		for(int i=0;i<musicList.size();i++) {
			if(musicList.get(i).getSinger().equals(music.getSinger())) {
				music.setTitle(title);
				musicList.set(i, music);
				return music;
			}
		}
		return null;
	}
	
	public int ascTitle() {
		musicList.sort((o1,o2)->{
			Music prev = (Music) o1;
			Music next = (Music) o2;
			return prev.getTitle().compareTo(next.getTitle());		
		});
		return 1;
	}
	
	public int descSinger() {
		musicList.sort((o1,o2)->{
			Music prev = (Music) o1;
			Music next = (Music) o2;
			return next.getSinger().compareTo(prev.getSinger());		
		});
		return 1;
	}
}
