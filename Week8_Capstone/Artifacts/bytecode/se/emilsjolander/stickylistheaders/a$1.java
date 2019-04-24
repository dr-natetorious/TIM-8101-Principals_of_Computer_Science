class se.emilsjolander.stickylistheaders.a$1 extends android.database.DataSetObserver {
  final se.emilsjolander.stickylistheaders.a a;

  se.emilsjolander.stickylistheaders.a$1(se.emilsjolander.stickylistheaders.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lse/emilsjolander/stickylistheaders/a;
       5: aload_0
       6: invokespecial #15                 // Method android/database/DataSetObserver."<init>":()V
       9: return

  public void onChanged();
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Lse/emilsjolander/stickylistheaders/a;
       4: invokestatic  #20                 // Method se/emilsjolander/stickylistheaders/a.c:(Lse/emilsjolander/stickylistheaders/a;)V
       7: return

  public void onInvalidated();
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Lse/emilsjolander/stickylistheaders/a;
       4: invokestatic  #24                 // Method se/emilsjolander/stickylistheaders/a.a:(Lse/emilsjolander/stickylistheaders/a;)Ljava/util/List;
       7: invokeinterface #29,  1           // InterfaceMethod java/util/List.clear:()V
      12: aload_0
      13: getfield      #12                 // Field a:Lse/emilsjolander/stickylistheaders/a;
      16: invokestatic  #32                 // Method se/emilsjolander/stickylistheaders/a.b:(Lse/emilsjolander/stickylistheaders/a;)V
      19: return
}
