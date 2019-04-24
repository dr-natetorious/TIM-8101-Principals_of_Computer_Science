class se.emilsjolander.stickylistheaders.StickyListHeadersListView$2 implements android.view.View$OnClickListener {
  final se.emilsjolander.stickylistheaders.StickyListHeadersListView a;

  se.emilsjolander.stickylistheaders.StickyListHeadersListView$2(se.emilsjolander.stickylistheaders.StickyListHeadersListView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
       4: invokestatic  #27                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.d:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$c;
       7: aload_0
       8: getfield      #17                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      11: aload_0
      12: getfield      #17                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      15: invokestatic  #30                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.a:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Landroid/view/View;
      18: aload_0
      19: getfield      #17                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      22: invokestatic  #34                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.b:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Ljava/lang/Integer;
      25: invokevirtual #40                 // Method java/lang/Integer.intValue:()I
      28: aload_0
      29: getfield      #17                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      32: invokestatic  #44                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.c:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Ljava/lang/Long;
      35: invokevirtual #50                 // Method java/lang/Long.longValue:()J
      38: iconst_1
      39: invokeinterface #55,  7           // InterfaceMethod se/emilsjolander/stickylistheaders/StickyListHeadersListView$c.a:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;Landroid/view/View;IJZ)V
      44: return
}
