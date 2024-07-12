import {createBrowserRouter,RouterProvider} from "react-router-dom";
import {QueryClient, QueryClientProvider} from "@tanstack/react-query";
import Home from "./home";
import OwnerRegistration from "./home/ParkingOwner/ParkingOwnerRegistration/Form.tsx";


const queryClient = new QueryClient()
function App() {


  const publicRoute = [
    {path: '/home', element: <Home/>,errorElement:<>error</>},
    {path: '', element: <Home/>,errorElement:<>error</>},
    {path: '/parking_owner', element: <OwnerRegistration/>,errorElement:<>error</>}
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
