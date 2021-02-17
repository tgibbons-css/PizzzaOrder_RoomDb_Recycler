package css.pizzzaorder;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OrderAdapter extends RecyclerView.Adapter<OrderViewHolder> {

    private Context context;
    private MainViewModel mainViewModel;

    public OrderAdapter(Application application, MainViewModel mainViewModel) {
        this.context = application;
        this.mainViewModel = mainViewModel;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_row, parent, false);
        OrderViewHolder holder = new OrderViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        String orderStr = mainViewModel.getOrderItem(position);
        holder.textViewOrderDetail.setText(orderStr);
    }

    @Override
    public int getItemCount() {
        return mainViewModel.getOrderSize();
    }
}
