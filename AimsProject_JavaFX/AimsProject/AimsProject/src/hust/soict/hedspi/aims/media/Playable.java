package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

abstract interface Playable {
	public void play() throws PlayerException;
}
