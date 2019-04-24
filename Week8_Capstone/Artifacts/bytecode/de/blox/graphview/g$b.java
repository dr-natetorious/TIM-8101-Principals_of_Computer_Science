class de.blox.graphview.g$b extends android.database.DataSetObserver {
  final de.blox.graphview.g a;

  de.blox.graphview.g$b(de.blox.graphview.g, de.blox.graphview.g$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #20                 // Method "<init>":(Lde/blox/graphview/g;)V
       5: return

  public void onChanged();
    Code:
       0: aload_0
       1: invokespecial #29                 // Method android/database/DataSetObserver.onChanged:()V
       4: aload_0
       5: invokespecial #31                 // Method a:()V
       8: return

  public void onInvalidated();
    Code:
       0: aload_0
       1: invokespecial #34                 // Method android/database/DataSetObserver.onInvalidated:()V
       4: aload_0
       5: invokespecial #31                 // Method a:()V
       8: return
}
