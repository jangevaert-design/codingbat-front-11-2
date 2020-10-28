public class Front11_2 {
  public int[] front11(int[] a, int[] b) {
    int lena = a.length;
    int lenb = b.length;
    if (lena == 0 && lenb == 0) {
      return new int[0];
    } else if (lena == 0) {
      return new int[] {b[0]};
    } else if (lenb == 0) {
      return new int[] {a[0]};
    } else {
      return new int[] {a[0], b[0]};
    }
  }
}
