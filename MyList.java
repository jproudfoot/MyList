public interface MyList<E> {

  /*
  * To check functionality of these methods use the method descriptions for the
  * List interaface in the Java API
  */
  public void add (E newData);
  public void add (int index, E newData);
  public E remove (int index);
  public int getSize ();
  public E get(int index);
  public boolean remove(E obj);
  public E set(int index, E obj);
  public int size();
  public void clear();
  public boolean isEmpty();
  public boolean contains(E obj);
  public int indexOf(E obj);
  public Iterator<E> iterator();
}
