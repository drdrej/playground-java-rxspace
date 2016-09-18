package com.touchableheroes.rxspace.values;

import java.util.LinkedList;

import com.touchableheroes.rxspace.Rule;
import com.touchableheroes.rxspace.listeners.OnChangeEntry;
import com.touchableheroes.rxspace.scopes.Scope;
import com.touchableheroes.rxspace.scopes.meta.ScopeKey;
import com.touchableheroes.rxspace.tx.TXOperations;

/**
 * Created by asiebert on 26.02.16.
 */
public class ChangeValueListener<T> implements IChangeValueListener<T> {

	private final LinkedList<OnChangeEntry> listeners = new LinkedList<OnChangeEntry>();
	
    public ChangeValueListener() {
        ;
    }
    
    public void listen( final OnChangeEntry listener ) {
    	listeners.add(listener);
    	return;
    }

	public void changed(ScopeKey key, T newValue, T oldValue) {
		for (final OnChangeEntry listener : listeners) {
			listener.onChange(null, newValue, null);
		}
	}

	public void afterChange(TXOperations ops) {
		// TODO Auto-generated method stub
		
	}

	
}
