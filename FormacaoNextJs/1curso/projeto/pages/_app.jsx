import Title from "../src/components/Title";
import GlobalStyle from "../src/theme/GlobalStyle";

function MyApp({ Component, pageProps }) {
    return (
        <>
            <Title>
                {/* Tag do google analytics */}
                <link rel="preconnect" href="https://fonts.googleapis.com" />
                <link rel="preconnect" href="https://fonts.gstatic.com" crossOrigin />
                <link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300..800;1,300..800&display=swap" rel="stylesheet" />
            </Title>
            <GlobalStyle />
            <Component {...pageProps} />
        </>
    )
}

export default MyApp;