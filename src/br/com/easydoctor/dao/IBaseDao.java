package br.com.easydoctor.dao;

public interface IBaseDao <K, T> {

	public K insert(T obj);
}
