package com.touchableheroes.rxspace.listeners;

import com.touchableheroes.rxspace.ListenerMatcher;
import com.touchableheroes.rxspace.scopes.meta.ScopeKey;
import com.touchableheroes.rxspace.values.ChangeValueListener;

public class OnChangeEntryListenerManager {

	private ChangeValueListener<OnChangeEntry> listeners = new ChangeValueListener<OnChangeEntry>();
	
	public void addListener(/* ListenerMatcher listenerMatcher, */ ScopeKey key,  OnChangeEntry listener) {
		
	}

	public void onChange(/* ListenerMatcher listenerMatcher, */ ScopeKey key,  Object newValue) {
		
	}
	
}
