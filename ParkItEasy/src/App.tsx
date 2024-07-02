import {createBrowserRouter,RouterProvider} from "react-router-dom";
import {QueryClient, QueryClientProvider} from "@tanstack/react-query";
import NavBar from "./home/NavigationBar";
import Home from "./home";


const queryClient = new QueryClient()
function App() {


  const publicRoute = [
    {path: '/home', element: <Home/>,errorElement:<>error</>},
    {path: '', element: <Home/>,errorElement:<>error</>}
  ]

  const privateRoute = [
    {}
  ]

  const isLoggedIn = false;
  return (
    <>
      <QueryClientProvider client={queryClient}>

        <RouterProvider router={
          createBrowserRouter(
              isLoggedIn ? privateRoute : publicRoute
          )
        }/>
      </QueryClientProvider>
    </>
  )
}

export default App
